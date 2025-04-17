package examen.examen.service;

import java.util.List;

import examen.examen.domain.Funciones;

public interface FuncionesService {
public List<Funciones> getFunciones();

    public void save(Funciones Funciones);

    public void delete(Funciones Funciones);
}
