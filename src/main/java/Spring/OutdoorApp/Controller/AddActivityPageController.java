package Spring.OutdoorApp.Controller;
import Spring.OutdoorApp.Logic.MyActivityService;
import Spring.OutdoorApp.model.MyActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/AddActivity")
public class AddActivityPageController {
    @Autowired
    private MyActivityService myActivityService;

    public AddActivityPageController(MyActivityService myActivityService) {
        this.myActivityService = myActivityService;
    }

    @GetMapping
    String showAddActivity(Model model){
        var myActivity = new MyActivity();
        model.addAttribute("myActivity",myActivity);

        return "AddActivity";
    }
    @PostMapping
    public String addActivity(@ModelAttribute("myActivity") @Valid MyActivity current, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return "AddActivity";
        }
        myActivityService.save(current);
        model.addAttribute("myActivity", new MyActivity());
        model.addAttribute("activities",myActivityService.readAll());

        return "AddActivity";
    }
    @ModelAttribute("activities")
    List<MyActivity> readActivities(){
        return myActivityService.readAll();

    }

    @Controller
    @RequestMapping("/MyAchievements")
    public static class MyAchievementsController {
        @Autowired
        private MyActivityService myActivityService;

        public void MyActivityController(MyActivityService myActivityService) {
            this.myActivityService = myActivityService;
        }

        @GetMapping
        String showMyAchievements(Model model){
            var myActivity = new MyActivity();
            model.addAttribute("myActivity",myActivity);
            return "MyAchievements";
        }

        @ModelAttribute("activities")
        List<MyActivity> readActivities(){
            return myActivityService.readAll();

        }
    }
}
