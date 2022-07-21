package dh.meli.spring.services;

import dh.meli.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable long id){
        User foundUser = userService.getUserById(id);
        if(foundUser != null){
            return ResponseEntity.ok(foundUser);
        }
        return ResponseEntity.notFound().build();
    }
}
