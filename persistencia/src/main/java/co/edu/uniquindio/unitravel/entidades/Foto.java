package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Foto implements Serializable {
    @Id
    private int codigo;
    private String url;

    @ManyToOne
    private Hotel hotel;
    @ManyToOne
    private Habitacion habitacion;
}
