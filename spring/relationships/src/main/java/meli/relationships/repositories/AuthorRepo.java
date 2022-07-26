package meli.relationships.repositories;

import meli.relationships.dto.AuthorDto;
import meli.relationships.models.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {
    @Query("SELECT author FROM Author author WHERE author.id = ?1")
    AuthorDto getById(long id);

    @Query(value = "SELECT * FROM author WHERE id = ?1", nativeQuery = true)
    Author getNativeById(long id);

    @Query("SELECT author FROM Author author LEFT JOIN FETCH author.address WHERE author.id = :id")
    AuthorDto getDtoEagle(long id);
}
