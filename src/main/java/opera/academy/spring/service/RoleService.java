package opera.academy.spring.service;

import opera.academy.spring.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}
