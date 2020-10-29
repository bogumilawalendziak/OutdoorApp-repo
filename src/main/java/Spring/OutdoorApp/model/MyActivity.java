package Spring.OutdoorApp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "myactivity")
public class MyActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String user;
    String activityName;
    @NotBlank(message = "Description must be not empty")
    public String description;
    @NotBlank(message = "Data must be not empty")
    public String data;

    public MyActivity(int id, String activityName, String description , String user , String data) {
        this.id = id;
        this.user = user;
        this.activityName = activityName;
        this.description = description;
        this.data = data;
    }

    public MyActivity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}



