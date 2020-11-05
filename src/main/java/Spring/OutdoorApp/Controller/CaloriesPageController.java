package Spring.OutdoorApp.Controller;

import Spring.OutdoorApp.Logic.CaloriesCalculator;
import Spring.OutdoorApp.model.CaloriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.net.http.HttpResponse;

@Controller
@RequestMapping("/Calories")
public class CaloriesPageController {
   @Autowired
    CaloriesRepository caloriesRepository;
   CaloriesCalculator calc;
    public CaloriesPageController( CaloriesRepository caloriesRepository) {
        this.caloriesRepository=caloriesRepository;

    }

    @GetMapping
    String showAddActivity( Model model){
        calc=new CaloriesCalculator();
        model.addAttribute("caloriesCalculator",calc);
        model.addAttribute("caloriesAll", caloriesRepository.findAll());

        return "Calories";
    }

    @PostMapping
    public String addCalories(@ModelAttribute("caloriesCalculator") CaloriesCalculator current, Model model) {

        model.addAttribute("caloriesCalculator", calc);
        model.addAttribute("answer",current.caloriesCalculator());
        model.addAttribute("caloriesAll", caloriesRepository.findAll());

        return "Calories";
    }
    @GetMapping("/lol")
    String calculate(Model model){


        return "Calories";
    }


}
