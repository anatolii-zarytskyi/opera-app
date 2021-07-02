package opera.academy.spring.dao;

import opera.academy.spring.model.ShoppingCart;
import opera.academy.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
