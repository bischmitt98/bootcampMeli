package meli.relationships.repositories;

import meli.relationships.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
}
