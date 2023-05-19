package pe.com.cine.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import pe.com.cine.app.Repository.PeliculaRepository;
import pe.com.cine.app.models.PeliculaEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller

public class PeliculasController {
    @Autowired
    private PeliculaRepository pelicularepository;
    @GetMapping("/listar")
    public String listar(Model model) {
        List<PeliculaEntity>peliculas = pelicularepository.findAll();
        model.addAttribute("peliculas",peliculas);
        return "listar";
    }
   
   
}
