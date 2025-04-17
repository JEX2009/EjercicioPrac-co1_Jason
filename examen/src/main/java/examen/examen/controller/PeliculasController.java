package examen.examen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import examen.examen.domain.Peliculas;
import examen.examen.service.PeliculasService;

@Controller
@Slf4j
@RequestMapping("/")
public class PeliculasController {

    @Autowired
    private PeliculasService peliculasService;

    @GetMapping("/")
    public String inicio(Model model) {
        var peliculas = peliculasService.getPeliculas();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("totalpeliculas", peliculas.size());
        return "/peliculas/listado";
    }

    
     @GetMapping("/nuevo")
    public String categoriaNuevo(Peliculas peliculas) {
        return "/peliculas/modifica";
    }
}
