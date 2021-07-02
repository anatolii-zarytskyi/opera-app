package opera.academy.spring.dao;

import java.util.Optional;
import opera.academy.spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String roleName);
}
