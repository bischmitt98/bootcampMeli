package joalheria.meli.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Joia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String material;

    @Column(length = 80, nullable = false)
    private double peso;

    @Column(length = 6, nullable = false)
    private double quilates;
}
