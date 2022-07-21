package dh.meli.spring.services;

import dh.meli.spring.models.User;
import dh.meli.spring.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    User getUserById(long id){
        return (User) userRepo.findById(id).orElse(null);
    }
}
