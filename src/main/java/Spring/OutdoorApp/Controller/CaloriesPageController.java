package Spring.OutdoorApp.Controller;

import Spring.OutdoorApp.Logic.CaloriesCalculator;
import Spring.OutdoorApp.model.CaloriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
    String showPageAddActivity( Model model){
        calc=new CaloriesCalculator();
        model.addAttribute("caloriesCalculator",calc);
        model.addAttribute("caloriesAll", caloriesRepository.findAll());

        return "Calories";
    }

    @PostMapping
    public String calculateCalories(@ModelAttribute("caloriesCalculator") CaloriesCalculator current, Model model) {

        model.addAttribute("caloriesCalculator", calc);
        model.addAttribute("answer",current.caloriesCalculator());
        model.addAttribute("caloriesAll", caloriesRepository.findAll());

        return "Calories";
    }

}
