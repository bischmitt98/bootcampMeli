package meli.cascading.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private BigDecimal rating;

    @Column
    private int favorite_movie_id;


}
