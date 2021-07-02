package opera.academy.spring.dao;

import java.util.List;
import opera.academy.spring.model.Order;
import opera.academy.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
