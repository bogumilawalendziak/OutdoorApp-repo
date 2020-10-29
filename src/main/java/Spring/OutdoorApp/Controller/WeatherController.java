package Spring.OutdoorApp.Controller;
import Spring.OutdoorApp.Logic.RequirementsService;
import Spring.OutdoorApp.Logic.WeatherService;
import Spring.OutdoorApp.model.ActivityRepository;
import Spring.OutdoorApp.model.ActualWeatherRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class WeatherController {

    ActivityRepository activityRepository;
    ActualWeatherRepository repository;
    RequirementsService requirementsOfActivities;
    WeatherService service;

    public WeatherController(ActualWeatherRepository repository , ActivityRepository activityRepository) throws IOException {
        this.repository = repository;
        this.activityRepository=activityRepository;
        requirementsOfActivities.ActivityHardcode(activityRepository);
        service = new WeatherService(repository,activityRepository);
    }

    @GetMapping("/mainWeather")
    public ResponseEntity getMainWeather(){
        return ResponseEntity.ok(service.getAllWeather());
    }
    @GetMapping("/Open")
    public ResponseEntity getOpen() throws IOException {
        return ResponseEntity.ok(service.getOpenWeatherResponseResponseEntity().getBody());
    }

    @GetMapping("/activitiesNow")
    public ResponseEntity getActivities()  {
        return ResponseEntity.ok(service.getActivitiesAvailable());
    }


}