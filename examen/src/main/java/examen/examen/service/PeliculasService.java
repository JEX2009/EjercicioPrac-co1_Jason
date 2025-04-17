package examen.examen.service;

import examen.examen.domain.*;
import java.util.List;

public interface PeliculasService {
    public List<Peliculas> getPeliculas();

    // Se inserta un nuevo Peliculas si el id del Peliculas esta vacio
    // Se actualiza un Peliculas si el id del Peliculas NO esta vacio
    public void save(Peliculas Peliculas);

    // Se elimina el Peliculas que tiene el id pasado por parámetro
    public void delete(Peliculas Peliculas);
}