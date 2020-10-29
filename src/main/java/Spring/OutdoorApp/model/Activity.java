package Spring.OutdoorApp.model;

import javax.persistence.*;

@Entity
@Table(name = "Activity")
public class Activity  {
@Id
    int id;
    @Column(name = "ACTIVITY_NAME")
    String activity_name;

    @Column(name = "windspeedmin")
    double windSpeedmin;
    @Column(name = "windspeedmax")
    double windSpeedMax;
    @Column(name = "winddegmin")
    double windDegMin;
    @Column(name = "winddegmax")
    double windDegMax;

    double rain;
    @Column(name = "swellmin")
    double swellMin;
    @Column(name = "swellmax")
    double swellMax;
    @Column(name = "tempmin")
    double minTemp;
    @Column(name = "tempmax")
    double maxTemp;
    @Column(name = "watermin")
    double waterMin;
    @Column(name = "watermax")
    double waterMax;


    public Activity(int id, String activity_name, double windSpeedmin, double windSpeedMax, double windDegMin, double windDegMax, double rain, double swellMin, double swellMax, double minTemp, double maxTemp, double waterMin, double waterMax) {
        this.id=id;
        this.activity_name = activity_name;
        this.windSpeedmin = windSpeedmin;
        this.windSpeedMax = windSpeedMax;
        this.windDegMin = windDegMin;
        this.windDegMax = windDegMax;
        this.rain = rain;
        this.swellMin = swellMin;
        this.swellMax = swellMax;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.waterMin = waterMin;
        this.waterMax = waterMax;
    }

    public Activity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivityName() {
        return activity_name;
    }

    public void setActivityName(String activityName) {
        this.activity_name = activityName;
    }

    public double getWindSpeedmin() {
        return windSpeedmin;
    }

    public void setWindSpeedmin(double windSpeedmin) {
        this.windSpeedmin = windSpeedmin;
    }

    public double getWindSpeedMax() {
        return windSpeedMax;
    }

    public void setWindSpeedMax(double windSpeedMax) {
        this.windSpeedMax = windSpeedMax;
    }

    public double getWindDegMin() {
        return windDegMin;
    }

    public void setWindDegMin(double windDegMin) {
        this.windDegMin = windDegMin;
    }

    public double getWindDegMax() {
        return windDegMax;
    }

    public void setWindDegMax(double windDegMax) {
        this.windDegMax = windDegMax;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSwellMin() {
        return swellMin;
    }

    public void setSwellMin(double swellMin) {
        this.swellMin = swellMin;
    }

    public double getSwellMax() {
        return swellMax;
    }

    public void setSwellMax(double swellMax) {
        this.swellMax = swellMax;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getWaterMin() {
        return waterMin;
    }

    public void setWaterMin(double waterMin) {
        this.waterMin = waterMin;
    }

    public double getWaterMax() {
        return waterMax;
    }

    public void setWaterMax(double waterMax) {
        this.waterMax = waterMax;
    }

}
