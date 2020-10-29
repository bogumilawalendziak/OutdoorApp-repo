package Spring.OutdoorApp.Logic;

import Spring.OutdoorApp.OpenWeatherAPI.OpenWeatherResponse;
import Spring.OutdoorApp.model.Activity;
import Spring.OutdoorApp.model.ActivityRepository;
import Spring.OutdoorApp.model.ActualWeather;
import Spring.OutdoorApp.model.ActualWeatherRepository;
import Spring.Superapp.OutdoorApp.WindyAPI.Windy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


@Service
public class WeatherService {

    ActivityRepository activityRepository;
    ActualWeatherRepository repository;
    ActualWeather actualWeather;
    List<Activity> activityList;
    String city;

    public WeatherService(ActualWeatherRepository repository, ActivityRepository activityRepository) throws IOException {
        this.repository = repository;
        this.activityRepository = activityRepository;
        getOpenWeatherResponseResponseEntity();

    }
    public ActualWeather getAllWeather(){
        return actualWeather;
    }

    public List<Activity> getActivitiesAvailable()  {
         activityList = activityRepository.findByQuery(actualWeather.getSwell(), actualWeather.getMainTemp(),actualWeather.getWindDeg(), actualWeather.getWindSpeed(),actualWeather.getMainTemp());

         return activityList;
    }


    public ResponseEntity<OpenWeatherResponse> getOpenWeatherResponseResponseEntity() throws IOException {

        Windy windy = new Windy();
        RestTemplate rt = new RestTemplate();
        city = "Gdansk";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ",pl&units=metric&appid=d9d5e7dd0725364f47a3dda5949d4151";
        ResponseEntity<OpenWeatherResponse> response = rt.getForEntity(url, OpenWeatherResponse.class);
        actualWeather = new ActualWeather(LocalDate.now(),response.getBody().getWeather().get(0).getIcon(), response.getBody().getMain().getTemp(), response.getBody().getWind().getSpeed(), response.getBody().getWind().getDeg(), 0, windy.getSwell(), windy.getWaterTemp(),response.getBody().getSys().getSunset());
        repository.save(actualWeather);

        return response;
    }

}
