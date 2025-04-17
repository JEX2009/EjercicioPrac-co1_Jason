package examen.examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.examen.domain.*;
import examen.examen.service.*;
import examen.examen.dao.PeliculasDao;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PeliculasServiceImpl implements PeliculasService{
    @Autowired
    private PeliculasDao peliculasDao ;

    public List<Peliculas> getPeliculas() {
        var lista = peliculasDao.findAll();
        return lista;
    }


    @Override
    @Transactional
    public void save(Peliculas Peliculas) {
        peliculasDao.save(Peliculas);
    }

    @Override
    @Transactional
    public void delete(Peliculas Peliculas) {
        peliculasDao.delete(Peliculas);
    }

}
