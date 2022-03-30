package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(nullable = false, length = 100)
    private String nombre;
    private String direccion;
    private String telefono;
    @Column(nullable = false)
    private int numEstrellas;

    @OneToMany
    private List<Habitacion> habitaciones;
    @ManyToMany
    private List<Caracteristica> caracteristicas;
    @OneToMany
    private List<Comentario> comentarios;
    @OneToMany
    private List<Foto> fotos;
    @ManyToOne
    private Ciudad ciudad;
    @ManyToOne
    private AdministradorHotel administradorHotel;

}
