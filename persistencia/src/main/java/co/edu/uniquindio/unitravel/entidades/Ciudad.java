package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ciudad implements Serializable {
    @Id
    private int codigo;
    private String nombre;

    @OneToMany
    private List<Hotel> hoteles;
    @OneToMany
    private List<Cliente> clientes;
    @OneToMany
    private List<Vuelo> vuelos;
}
