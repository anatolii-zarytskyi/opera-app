package opera.academy.spring.dao.impl;

import opera.academy.spring.dao.AbstractDao;
import opera.academy.spring.dao.StageDao;
import opera.academy.spring.model.Stage;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StageDaoImpl extends AbstractDao<Stage> implements StageDao {
    public StageDaoImpl(SessionFactory factory) {
        super(factory, Stage.class);
    }
}
