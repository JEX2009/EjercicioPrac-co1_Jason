package examen.examen.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import examen.examen.domain.Funciones;
import examen.examen.service.FuncionesService;

@Controller
@Slf4j
@RequestMapping("/cartelera")
public class FuncionesController {
    @Autowired
    private FuncionesService FuncionesService;

    @GetMapping("/")
    public String inicio(Model model) {
        var Funciones = FuncionesService.getFunciones();
        model.addAttribute("funciones", Funciones);
        model.addAttribute("totalFunciones", Funciones.size());
        return "/cartelera/listado";
    }

    
     @GetMapping("/nuevo")
    public String categoriaNuevo(Funciones Funciones) {
        return "/cartelera/modifica";
    }
}
