package examen.examen.controller;
import examen.examen.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService ProductoService;

    @GetMapping("/producto")
    public String inicio(Model model) {
        var Productos = ProductoService.getProductos();
        model.addAttribute("Productos", Productos);
        model.addAttribute("totalProductos", Productos.size());
        return "/productos/producto";
    }
}