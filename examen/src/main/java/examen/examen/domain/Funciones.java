package examen.examen.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "funciones")
public class Funciones implements Serializable  {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idFuncion;
    private String fecha;
    private String hora;
    private String sala;

    @ManyToOne
    @JoinColumn(name = "idPelicula", referencedColumnName = "id")
    private Peliculas peliculas;

     public Funciones() {
    }

   public Funciones(Peliculas pelicula, String fecha, String hora, String sala) {
       this.peliculas = pelicula;
       this.fecha = fecha;
       this.hora = hora;
       this.sala = sala;
   }

}
