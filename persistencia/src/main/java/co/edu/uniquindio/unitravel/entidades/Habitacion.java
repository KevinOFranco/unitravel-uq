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
public class Habitacion implements Serializable {
    @Id
    private int numero;
    private float precio;
    private int capacidad;

    @ManyToMany
    private List<Reserva> reservas;
    @ManyToOne
    private Hotel hotel;
    @ManyToMany
    private List<Caracteristica> caracteristicas;
    @OneToMany
    private List<Foto> fotos;
    @OneToMany
    private List<Cama> camas;
}
