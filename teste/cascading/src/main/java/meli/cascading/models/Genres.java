package meli.cascading.models;

import lombok.Data;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Data
public class Genres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    @Column
    private char name;

    @Column
    private int ranking;

    @Column
    private int active;

}
