package meli.relationships.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String name;


    @OneToOne(mappedBy = "author") // fetch = FetchType.LAZY
    // author = nome do campo na tabela Address que é usada como referência
    @JsonIgnoreProperties("author")
    // ignora os dados do author ao preencher os dados do address
    private Address address;
}
