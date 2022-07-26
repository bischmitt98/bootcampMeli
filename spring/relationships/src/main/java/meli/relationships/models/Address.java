package meli.relationships.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String location;


    @OneToOne
    @JoinColumn(name = "id_author")
    // chave estrangeira
    private Author author;
}
