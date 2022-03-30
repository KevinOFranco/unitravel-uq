package co.edu.uniquindio.unitravel.entidades;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente extends Persona implements Serializable {

    @ElementCollection
    private Map<String, String> telefonos;

    @OneToMany
    private List<Reserva> reservas;
    @OneToMany
    private List<Comentario> comentarios;
    @ManyToOne
    private Ciudad ciudad;

}
