package opera.academy.spring.service;

import java.time.LocalDate;
import java.util.List;
import opera.academy.spring.model.PerformanceSession;

public interface PerformanceSessionService {
    List<PerformanceSession> findAvailableSessions(Long movieId, LocalDate date);

    PerformanceSession add(PerformanceSession session);

    PerformanceSession get(Long id);

    PerformanceSession update(PerformanceSession movieSession);

    void delete(Long id);
}
