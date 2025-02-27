package examen.examen.dao;
import examen.examen.domain.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Productos,Long> {

}
