package br.com.meli.meli.controllers;

import br.com.meli.meli.dto.UserDto;
import br.com.meli.meli.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Controller rest class
@RequestMapping("/user")
public class Hello {

    @GetMapping("/hi/{name}/{id}")// Get req
    public String sayHello(@PathVariable String name, @PathVariable int id){
        return "Hi " + name + ": " + id + "!";
    }

    @GetMapping("/hi/")// Get req
    public String sayHello2(@RequestParam String name, @RequestParam int id){
        return "Hi " + name + ": " + id + "!";
    }

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody User user){
        if(user.getId() == 123){
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
