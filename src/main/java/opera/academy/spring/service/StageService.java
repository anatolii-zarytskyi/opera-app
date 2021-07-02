package opera.academy.spring.service;

import java.util.List;
import opera.academy.spring.model.Stage;

public interface StageService {
    Stage add(Stage stage);

    Stage get(Long id);

    List<Stage> getAll();
}
