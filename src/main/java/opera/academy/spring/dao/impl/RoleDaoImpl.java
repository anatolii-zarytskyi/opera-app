package opera.academy.spring.dao.impl;

import java.util.Optional;
import opera.academy.spring.dao.AbstractDao;
import opera.academy.spring.dao.RoleDao;
import opera.academy.spring.exception.DataProcessingException;
import opera.academy.spring.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {

    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("FROM Role WHERE roleName = :name", Role.class)
                    .setParameter("name", Role.RoleName.valueOf(roleName))
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find role by name: " + roleName, e);
        }
    }
}
