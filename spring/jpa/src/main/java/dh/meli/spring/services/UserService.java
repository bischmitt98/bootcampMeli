package dh.meli.spring.services;

import dh.meli.spring.exceptions.BadRequestException;
import dh.meli.spring.exceptions.UserNotFoundException;
import dh.meli.spring.models.User;
import dh.meli.spring.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepo userRepo;

    public User getUserById(long id){
        return userRepo.findById(id).orElseThrow(()->
                new UserNotFoundException("Usuário não encontrado. Id: " + id));
    }

    @Override
    public List<User> listAll() {
        return (List<User>) userRepo.findAll();
    }
    
    @Override
    public User insertUser(User newUser) {
        if(newUser.getId() > 0)
            throw new BadRequestException("O usuário não pode ter id para ser inserido!");
        return userRepo.save(newUser);
    }

    @Override
    public User updateUser(User user){
        User foundUser = getUserById(user.getId());
        return userRepo.save(user);
    }

    @Override
    public User updatePartial(long id, Map<String, String> changes) {
        User foundUser = getUserById(id);
        changes.forEach((atributo, valor)->{
            switch (atributo){
                case "name" : foundUser.setName(valor); break;
                case "email" : foundUser.setEmail(valor); break;
            }
        });
        return userRepo.save(foundUser);
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public void deleteUser(long id){
        User foundUser = getUserById(id);
        userRepo.delete(foundUser);
    }
}
