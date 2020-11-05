package Spring.OutdoorApp.Logic;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class CaloriesCalculator {
    int calories;
    int weight;
    int timeMin;
    private static DecimalFormat df = new DecimalFormat("0.00");

    public CaloriesCalculator(int calories, int weight, int timeMin) {
        this.calories = calories;
        this.weight = weight;
        this.timeMin = timeMin;
    }

    public CaloriesCalculator() {
    }

    public String caloriesCalculator(){

        float factor = (float)calories/(3600);

       return  df.format(factor*weight*timeMin);
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(int timeMin) {
        this.timeMin = timeMin;
    }

}
