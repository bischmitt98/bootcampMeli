package dh.meli.spring.services;

import dh.meli.spring.models.User;

import java.util.List;

public interface IUserService {
    User getUserById(long id);
    User insertUser(User newUser);
    void deleteUser(long id);
    List<User> listAll();
}
