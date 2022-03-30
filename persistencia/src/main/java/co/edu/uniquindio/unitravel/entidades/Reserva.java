package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva implements Serializable {
    @Id
    private int codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDateTime fechaReserva;
    private float precioTotal;
    private String estado;
    private int cantidadPersonas;

    @ManyToOne
    private Cliente cliente;
    @ManyToMany
    private List<Habitacion> habitaciones;
    @ManyToMany
    private List<Silla> sillas;
}
