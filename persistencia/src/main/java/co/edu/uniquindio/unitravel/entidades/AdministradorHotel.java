package co.edu.uniquindio.unitravel.entidades;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdministradorHotel extends Persona implements Serializable {
    @OneToMany
    private List<Hotel> hoteles;
}
