package opera.academy.spring.service;

import opera.academy.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
