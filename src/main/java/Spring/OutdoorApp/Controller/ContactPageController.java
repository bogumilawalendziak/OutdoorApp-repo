package Spring.OutdoorApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Contact")
public class ContactPageController {

    @GetMapping
    String getContact(){
        return "Contact";
    }
}
