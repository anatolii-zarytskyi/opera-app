package opera.academy.spring.service.impl;

import java.util.List;
import opera.academy.spring.dao.StageDao;
import opera.academy.spring.exception.DataProcessingException;
import opera.academy.spring.model.Stage;
import opera.academy.spring.service.StageService;
import org.springframework.stereotype.Service;

@Service
public class StageServiceImpl implements StageService {
    private final StageDao stageDao;

    public StageServiceImpl(StageDao stageDao) {
        this.stageDao = stageDao;
    }

    @Override
    public Stage add(Stage cinemaHall) {
        return stageDao.add(cinemaHall);
    }

    @Override
    public Stage get(Long id) {
        return stageDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get stage by id " + id));
    }

    @Override
    public List<Stage> getAll() {
        return stageDao.getAll();
    }
}
