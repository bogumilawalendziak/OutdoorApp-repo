package Spring.OutdoorApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@RepositoryRestController
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

    @Override
    Activity save(Activity activity);

    @Override
    List<Activity> findAll();

    @Query(nativeQuery = true,value = "SELECT * FROM Activity WHERE swellmin <= :swell AND swellmax >= :swell "+
                                       "AND watermin <= :watertemp AND watermax >= :watertemp "+
                                       "AND winddegmin <= :windDeg AND winddegmax >= :windDeg "+
                                       "AND windspeedmin <= :windspeed AND windspeedmax >= :windspeed "+
                                       "AND tempmin <= :temp AND tempmax >= :temp")
    List<Activity> findByQuery(double swell, double watertemp , double windDeg , double windspeed, double temp);

    @Transactional
    @Query(nativeQuery = true,value = "SELECT * FROM Activity WHERE swellmin <= :swell")
    List<Activity> findByQuery2(double swell);



    @Query(nativeQuery = true,value = "SELECT * FROM Activity")
    List<Activity> findByQuery3();

    @Query(nativeQuery = true,value = "SELECT * FROM Activity WHERE activity_name=:activity")
    Activity findByName(String activity);
}

