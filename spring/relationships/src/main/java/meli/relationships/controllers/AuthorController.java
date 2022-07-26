package meli.relationships.controllers;

import meli.relationships.dto.AuthorDto;
import meli.relationships.models.Author;
import meli.relationships.repositories.AuthorRepo;
import meli.relationships.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getById(@PathVariable long id) {
        return ResponseEntity.ok(authorRepo.findById(id).get());
    }
    @GetMapping("/dto/{id}")
    public ResponseEntity<AuthorDto> getDtoById(@PathVariable long id) {
        return ResponseEntity.ok(authorRepo.getById(id));
    }

    @GetMapping("/native/{id}")
    public ResponseEntity<Author> getNativeDtoById(@PathVariable long id) {
        return ResponseEntity.ok(authorRepo.getNativeById(id));
    }

    @GetMapping("/eagle/{id}")
    public ResponseEntity<AuthorDto> getEagDtoById(@PathVariable long id) {
        return ResponseEntity.ok(authorRepo.getDtoEagle(id));
    }

    @PostMapping
    public ResponseEntity<Author> newAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.save(author));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        authorRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
