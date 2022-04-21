package my.home.bootrepository.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(message = "Name should not be between 2 and 20 characters", min = 2, max = 20)
    @NotEmpty(message = "Field first name cannot be empty")
    @Column(name = "name")
    private String firstName;
    @Length(message = "Last name should not be between 2 and 30 characters", min = 2, max = 30)
    @NotEmpty(message = "Field last name cannot be empty")
    private String lastName;
    @NotEmpty(message = "Field mail cannot be empty")
    @Email(message = "Email should be valid")
    private String email;
    @Column
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
