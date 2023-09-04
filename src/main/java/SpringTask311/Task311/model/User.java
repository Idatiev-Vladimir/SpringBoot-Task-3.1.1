package SpringTask311.Task311.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    @Column
    private String sex;

    @Column
    private String location;

    @Column
    private short salary;

    @Column
    private float height;

    public User(String name, String surname, int age, String sex, String location, short salary, float height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.location = location;
        this.salary = salary;
        this.height = height;
    }
}
