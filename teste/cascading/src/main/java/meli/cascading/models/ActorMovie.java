package meli.cascading.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class ActorMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    @Column
    private int actor_id;

    @Column
    private int movie_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Actors actors;
}
