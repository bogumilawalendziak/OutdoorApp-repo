package Spring.OutdoorApp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="HistoryWeather")
public class ActualWeather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate date;
    private String icon;
    private double mainTemp;
    private double windSpeed;
    private double rain;
    private double swell;
    private double waterTemp;
    private double windDeg;
    private double sunset;

    public ActualWeather(LocalDate date , String icon , double mainTemp, double windSpeed, double windDeg, double rain, double swell, double waterTemp,int sunset) {
        this.icon = icon;
        this.mainTemp = mainTemp;
        this.windSpeed = windSpeed;
        this.rain = rain;
        this.swell = swell;
        this.date = date;
        this.windDeg = windDeg;
        this.waterTemp = waterTemp;
        this.sunset=sunset;

    }

    public ActualWeather() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getMainTemp() {
        return mainTemp;
    }

    public void setMainTemp(double mainTemp) {
        this.mainTemp = mainTemp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSwell() {
        return swell;
    }

    public void setSwell(double swell) {
        this.swell = swell;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }

    public double getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(double windDeg) {
        this.windDeg = windDeg;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }
}
