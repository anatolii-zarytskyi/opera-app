package opera.academy.spring.service.impl;

import java.util.Set;
import opera.academy.spring.model.Role;
import opera.academy.spring.model.User;
import opera.academy.spring.service.AuthenticationService;
import opera.academy.spring.service.RoleService;
import opera.academy.spring.service.ShoppingCartService;
import opera.academy.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getRoleByName(Role.RoleName.USER.name())));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
