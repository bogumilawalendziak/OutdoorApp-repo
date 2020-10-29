package Spring.OutdoorApp.Controller;

import Spring.OutdoorApp.Logic.MyActivityService;
import Spring.OutdoorApp.model.MyActivity;
import Spring.OutdoorApp.model.Notification;
import Spring.OutdoorApp.model.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Notification")
public class NotificationPageController {
    @Autowired
    NotificationRepository notificationRepository;
    @Autowired
    MyActivityService myActivityService;

    public NotificationPageController(NotificationRepository notificationRepository, MyActivityService myActivityService) {
        this.notificationRepository = notificationRepository;
        this.myActivityService = myActivityService;
    }

    @GetMapping
    String showNotification(Model model){
        model.addAttribute("notification",new Notification());
        return "Notification";
    }

    @PostMapping
    String addNotification(Notification notification,Model model){
        model.addAttribute("notification", new Notification());
        notificationRepository.save(notification);

        return "Notification";
    }

    @ModelAttribute("activities")
    List<MyActivity> readActivities(){
        return myActivityService.readAll();

    }


}
