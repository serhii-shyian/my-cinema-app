package cinema.app.service.security;

import cinema.app.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
