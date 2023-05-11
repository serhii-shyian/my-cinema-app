package cinema.app.service;

import cinema.app.model.MovieSession;
import cinema.app.model.ShoppingCart;
import cinema.app.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
