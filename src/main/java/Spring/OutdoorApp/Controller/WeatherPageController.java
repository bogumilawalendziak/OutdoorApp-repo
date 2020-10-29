package Spring.OutdoorApp.Controller;

import Spring.OutdoorApp.Logic.WeatherService;
import Spring.OutdoorApp.model.ActualWeather;
import Spring.OutdoorApp.model.ActualWeatherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Weather")
public class WeatherPageController {

    ActualWeatherRepository actualWeatherRepository;
    WeatherService service;

    public WeatherPageController(WeatherService service) {
        this.service = service;
    }

    @GetMapping
    String getWeather(Model model){

        model.addAttribute("weather",new ActualWeather());
        return "Weather";
    }
}
