package examen.examen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/formularios")
public class FormularioController {


    @GetMapping("/formulario")
    public String inicio() {
        
        return "/formularios/formulario";
    }

}
