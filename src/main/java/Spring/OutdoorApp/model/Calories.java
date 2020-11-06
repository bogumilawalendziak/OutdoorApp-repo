package Spring.OutdoorApp.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name="calories")
public class Calories {
    @Id
    private int id;

    @OneToOne
    @JoinColumn(name="activity")
    @JsonManagedReference
    private Activity activity;
    private int factor;

    public Calories(int id, Activity activity, int factor) {
        this.id = id;
        this.activity = activity;
        this.factor = factor;
    }

    public Calories() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }
}
