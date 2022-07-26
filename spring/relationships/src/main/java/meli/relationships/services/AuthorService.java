package meli.relationships.services;

import meli.relationships.models.Author;
import meli.relationships.repositories.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    @Transactional
    public Author save(Author author){
        author.getAddress().setAuthor(author);
        return authorRepo.save(author);
    }
}
