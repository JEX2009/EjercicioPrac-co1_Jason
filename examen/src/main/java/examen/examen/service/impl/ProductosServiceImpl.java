package examen.examen.service.impl;

import examen.examen.dao.ProductoDao;
import examen.examen.domain.Productos;
import examen.examen.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao ProductoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Productos> getProductos() {
        return ProductoDao.findAll();
    }
}
