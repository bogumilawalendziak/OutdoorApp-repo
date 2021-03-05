package Spring.OutdoorApp.Logic;

import Spring.OutdoorApp.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class RequirementsService {
    ActivityRepository activityRepository;
    CaloriesRepository caloriesRepository;
    ActivityData activityData;

    public RequirementsService(ActivityRepository activityRepository, CaloriesRepository caloriesRepository,
                               ActivityData activityData) {
        this.activityRepository = activityRepository;
        this.caloriesRepository = caloriesRepository;
        this.activityData = activityData;
        List<Activity> activities = activityData.ActivityData();

        saveActivities(activities);
        List<Calories> calories = createCaloriesData(activities);
        saveCalories(calories);

    }

    private void saveActivities(List<Activity> activities) {
        activities.forEach(activityRepository::save);
    }

    public List<Calories> createCaloriesData(List<Activity> activities) {
        Random random = new Random();
        List<Calories> calories = new ArrayList<>();

        activities.stream().forEach(activity -> {

            calories.add(new Calories(activity.getId(), activityRepository.findByName(activity.getActivityName())
                    , random.nextInt(700) + 400));
        });
        return calories;
    }

    public void saveCalories(List<Calories> calories) {
        calories.forEach(cal -> caloriesRepository.save(cal));
    }

}
