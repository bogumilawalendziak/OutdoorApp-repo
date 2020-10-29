package Spring.OutdoorApp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/index")
   public class MainPageController {

    public MainPageController() {
    }

    @GetMapping
    String showMain(){
        return "index";
    }

}
