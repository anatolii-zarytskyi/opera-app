package opera.academy.spring.service;

import java.util.List;
import opera.academy.spring.model.Performance;

public interface PerformanceService {
    Performance add(Performance performance);

    Performance get(Long id);

    List<Performance> getAll();
}
