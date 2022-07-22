package dh.meli.spring.services;

import dh.meli.spring.models.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    User getUserById(long id);
    User insertUser(User newUser);
    void deleteUser(long id);
    List<User> listAll();
    User updatePartial(long id, Map<String, String> changes);
    User updateUser(User user);
    User findByEmail(String email);
}
