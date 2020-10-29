package Spring.OutdoorApp.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestController
public interface NotificationRepository extends JpaRepository<Notification,Integer> {

    @Override
    List<Notification> findAll();

    @Override
    Notification save(Notification entities);
}
