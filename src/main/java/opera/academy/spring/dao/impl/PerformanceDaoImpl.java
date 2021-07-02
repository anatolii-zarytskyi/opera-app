package opera.academy.spring.dao.impl;

import opera.academy.spring.dao.AbstractDao;
import opera.academy.spring.dao.PerformanceDao;
import opera.academy.spring.model.Performance;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PerformanceDaoImpl extends AbstractDao<Performance> implements PerformanceDao {
    public PerformanceDaoImpl(SessionFactory factory) {
        super(factory, Performance.class);
    }
}
