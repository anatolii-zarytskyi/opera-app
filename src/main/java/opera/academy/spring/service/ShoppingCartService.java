package opera.academy.spring.service;

import opera.academy.spring.model.PerformanceSession;
import opera.academy.spring.model.ShoppingCart;
import opera.academy.spring.model.User;

public interface ShoppingCartService {
    void addSession(PerformanceSession session, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
