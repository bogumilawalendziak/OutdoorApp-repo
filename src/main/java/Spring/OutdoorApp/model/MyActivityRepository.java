package Spring.OutdoorApp.model;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyActivityRepository extends JpaRepository<MyActivity, Integer> {


    @Override
    List<MyActivity> findAll();
    @Override
    MyActivity save(MyActivity entity);

    @Override
    List<MyActivity> findAll(Sort sort);

    @Override
    Optional<MyActivity> findById(Integer integer);
}
