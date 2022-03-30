package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vuelo implements Serializable {
    @Id
    private int codigo;
    private String estado;
    private String aerolinea;

    @OneToMany
    private List<Silla> sillas;
    @ManyToOne
    private Ciudad ciudadOrigen;
    @ManyToOne
    private Ciudad ciudadDestino;
}
