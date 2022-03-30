package co.edu.uniquindio.unitravel.entidades;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    @Column (nullable = false)
    private String nombre;

    @Email
    @Column (nullable = false, length = 100, unique = true)
    private String email;

    @ElementCollection
    private Map<String, String> telefonos;

}
