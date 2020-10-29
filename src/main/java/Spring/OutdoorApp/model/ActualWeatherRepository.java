package Spring.OutdoorApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ActualWeatherRepository extends JpaRepository<ActualWeather,Integer> {
    List<ActualWeather> findAll();
    ActualWeather save(ActualWeather entity);


}
