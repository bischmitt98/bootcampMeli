package meli.relationships.controllers;

import meli.relationships.models.Author;
import meli.relationships.models.Book;
import meli.relationships.repositories.AuthorRepo;
import meli.relationships.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable long id) {
        return ResponseEntity.ok(bookRepo.findById(id).get());
    }
}