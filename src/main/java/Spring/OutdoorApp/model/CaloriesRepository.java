package Spring.OutdoorApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaloriesRepository extends JpaRepository<Calories,Integer> {

    @Override
    List<Calories> findAll();

    @Override
    Calories save(Calories entity);
}
