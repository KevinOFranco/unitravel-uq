package co.edu.uniquindio.unitravel.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario implements Serializable {
    @Id
    private int codigo;
    @Column(nullable = false)
    private String comentario;
    @Column(nullable = false)
    private int calificacion;
    private LocalDate fechaCalificacion;

    @ManyToOne
    private Hotel hotel;
    @ManyToOne
    private Cliente cliente;
}
