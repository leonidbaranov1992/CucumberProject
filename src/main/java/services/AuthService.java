package services;

import models.User;


public interface AuthService extends BasicService{

    User createUser(User user);
    String login();
    String login2();
}
