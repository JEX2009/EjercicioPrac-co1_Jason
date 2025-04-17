package examen.examen.domain;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "peliculas")
public class Peliculas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPelicula;
    private String titulo;
    private String tipo;

    @OneToMany(mappedBy = "peliculas")
    private List<Funciones> funciones;

    public Peliculas() {
    }
    public Peliculas(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }

        
}
