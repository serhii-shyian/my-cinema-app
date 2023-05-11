package cinema.app.service;

import cinema.app.model.Order;
import cinema.app.model.ShoppingCart;
import cinema.app.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
