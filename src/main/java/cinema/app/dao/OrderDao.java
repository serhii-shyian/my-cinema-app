package cinema.app.dao;

import cinema.app.model.Order;
import cinema.app.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
