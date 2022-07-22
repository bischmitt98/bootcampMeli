package dh.meli.spring.controllers;


import dh.meli.spring.models.User;
import dh.meli.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> listAll() {
        return ResponseEntity.ok(userService.listAll());
    }

    @PostMapping
    public ResponseEntity<User> insertNewUser(@RequestBody User user) {
        // TODO: validar se o user tem Id e lançar exception
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.insertUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id) {
        userService.getUserById(id);
        return ResponseEntity.noContent().build();


    }
}
