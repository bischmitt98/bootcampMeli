package meli.cascading.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    @Column
    private char title;

    @Column
    private int awards;

    @Column
    private int length;

    @Column
    private BigDecimal rating;

    @Column
    private int genre_id;
}
