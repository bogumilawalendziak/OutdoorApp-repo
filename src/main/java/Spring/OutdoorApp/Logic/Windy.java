package Spring.OutdoorApp.Logic;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Windy {
    private double swell;
    private double waterTemp;

    public Windy() throws IOException {
        Connection connect = Jsoup.connect("https://www.surf-forecast.com/breaks/Chalupy/forecasts/latest/six_day");
        Document document = connect.get();

        Elements allH1 = document.select("#forecast-table > div.forecast-table__content > table > tbody > tr:nth-child(5) > td:nth-child(1) > svg > text");
        String swellString = allH1.text();
        swell=Double.parseDouble(swellString);

        Elements waterTempEl =  document.select("#contdiv > section.break-header > div > div.break-header__content > div.break-header__temperature.break-header__temperature--tablet > b > span.temp");
        String waterTempString=waterTempEl.text();
        waterTemp = Double.parseDouble(waterTempString);
    }

    public double getSwell() {
        return swell;
    }

    public void setSwell(float swell) {
        this.swell = swell;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }
}



