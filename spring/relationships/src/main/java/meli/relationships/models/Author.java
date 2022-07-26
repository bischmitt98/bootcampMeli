package meli.relationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL) // fetch = FetchType.LAZY
    // author = nome do campo na tabela Address que é usada como referência
    @JsonIgnoreProperties("author")
    // ignora os dados do author ao preencher os dados do address
    private Address address;

    @ManyToMany
    @JoinTable(name = "book_author",
            // nome da tabela de ligacao
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            //atributo do author na tabela de ligacao
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
            // att do book na tabela de ligacao
    @JsonIgnoreProperties("authors")
    private List<Book> books;
}
