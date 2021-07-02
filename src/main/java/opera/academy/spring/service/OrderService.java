package opera.academy.spring.service;

import java.util.List;
import opera.academy.spring.model.Order;
import opera.academy.spring.model.ShoppingCart;
import opera.academy.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
