package Spring.OutdoorApp.Logic;

import Spring.OutdoorApp.model.Activity;
import Spring.OutdoorApp.model.ActivityRepository;

import org.springframework.stereotype.Service;


@Service
public class RequirementsService {



    public static void ActivityHardcode(ActivityRepository activityRepository){
        Activity Surfing = new Activity(1,"Surfing",0.0,10.0,33.0,123.0,0.0,1.5,10.0,15.0,35.0,10.0,28);
        Activity Climbing = new Activity(2,"Wspinaczka",0.0,10,0,360,0,0,20,18,35,10,28);
        Activity Running = new Activity(3,"Bieganie",0,10,0,360,0,0,20,5,25,0,28);
        Activity Swimming = new Activity(4,"Pływanie",0.0,7.0,0,360,0.0,0,1.5,26.0,37.0,18.0,28);
        Activity Skiing = new Activity(5,"Jazda na nartach",0.0,6,0,360,0,0,20,-10,6,-2,7);
        Activity Hikking = new Activity(6,"Chodzenie po górach",0,11,0,360,4,0,20,0,28,0,28);
        Activity Walking = new Activity(7,"Spacer",0,10,0,360,4,0,20,0,35,0,28);
        Activity Rollerblading = new Activity(8,"Jazda na rolkach",0,10,0,360,0,0,20,0,35,0,28);
        Activity Biking = new Activity(9,"Jazda na rowerze",0,10,0,360,0,0,20,0,35,0,28);


        activityRepository.save(Surfing);
        activityRepository.save(Climbing);
        activityRepository.save(Running);
        activityRepository.save(Swimming);
        activityRepository.save(Skiing);
        activityRepository.save(Hikking);
        activityRepository.save(Walking);
        activityRepository.save(Rollerblading);
        activityRepository.save(Biking);
    }
}
