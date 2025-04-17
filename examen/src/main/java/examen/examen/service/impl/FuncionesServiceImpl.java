package examen.examen.service.impl;

import examen.examen.service.FuncionesService;
import examen.examen.domain.*;
import examen.examen.dao.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FuncionesServiceImpl implements FuncionesService{
    @Autowired
    private FuncionesDao funcionesDao;

    public List<Funciones> getFunciones() {
        var lista = funcionesDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Funciones Funciones) {
        funcionesDao.save(Funciones);
    }

    @Override
    @Transactional
    public void delete(Funciones Funciones) {
        funcionesDao.delete(Funciones);
    }
}
