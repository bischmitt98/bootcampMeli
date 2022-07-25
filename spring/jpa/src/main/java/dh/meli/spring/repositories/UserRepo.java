package dh.meli.spring.repositories;

import dh.meli.spring.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
//    User findByName(String name);
//    User findByNameOrEmail(String name, String email);
}
