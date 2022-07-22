package dh.meli.spring.services;

import dh.meli.spring.exceptions.BadRequestException;
import dh.meli.spring.exceptions.UserNotFoundException;
import dh.meli.spring.models.User;
import dh.meli.spring.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepo userRepo;

    public User getUserById(long id){
        return userRepo.findById(id).orElseThrow(()->
                new UserNotFoundException("Usuário não encontrado. Id: " + id));
    }

    @Override
    public User insertUser(User newUser) {
        if(newUser.getId() > 0)
            throw new BadRequestException("O usuário não pode ter id para ser inserido!");
        return userRepo.save(newUser);
    }

    public void deleteUser(long id){
        User foundUser = getUserById(id);
        userRepo.delete(foundUser);
    }

    @Override
    public List<User> listAll() {
        return (List<User>) userRepo.findAll();
    }

}
