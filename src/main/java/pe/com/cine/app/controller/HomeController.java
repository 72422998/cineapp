package pe.com.cine.app.controller;
import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.com.cine.app.models.PeliculaEntity;
import pe.com.cine.app.repository.PeliculaRepository;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @Autowired
    private PeliculaRepository pelicularepository;
    @GetMapping("/listar")
    public String listar(Model model) {
        List<PeliculaEntity>peliculas = pelicularepository.findAll();
        model.addAttribute("peliculas",peliculas);
        return "listar";

    
    }
    @GetMapping("/crear")
    public String crearformulario(Model model) {
        model.addAttribute("peliculas", new PeliculaEntity());
        return "crear";  
    }


    @PostMapping("/crear") 
    public String guardarformulario(@ModelAttribute("peliculas") PeliculaEntity pelicula)
    {
        pelicularepository.save(pelicula);
        return "redirect:/listar";
    }


}
