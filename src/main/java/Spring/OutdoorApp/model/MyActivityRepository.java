package Spring.OutdoorApp.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyActivityRepository extends JpaRepository<MyActivity, Integer> {


    @Override
    List<MyActivity> findAll();
    @Override
    MyActivity save(MyActivity entity);

}
