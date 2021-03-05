package Spring.OutdoorApp.Logic;

import Spring.OutdoorApp.model.MyActivity;
import Spring.OutdoorApp.model.MyActivityRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class MyActivityService {


    MyActivityRepository repository;

    public MyActivityService(MyActivityRepository repository) {

        this.repository = repository;
    }

    public List<MyActivity> readAll() {

        return repository.findAll();
    }

    public MyActivity save(MyActivity myActivity) {

        return repository.save(myActivity);
    }

    public MyActivity findById(MyActivity myActivity) throws NotFoundException {

        return repository.findById(myActivity.getId()).orElseThrow(
                () -> new IllegalArgumentException("Nie znaleziono aktywności o danym ID"));
    }


}
