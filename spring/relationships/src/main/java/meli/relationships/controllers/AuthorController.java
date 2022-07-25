package meli.relationships.controllers;

import meli.relationships.models.Author;
import meli.relationships.repositories.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepo authorRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getById(@PathVariable long id) {
        return ResponseEntity.ok(authorRepo.findById(id).get());
    }
}
