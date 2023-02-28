package com.ExamenPractico.controller;

import com.ExamenPractico.domain.Estudiante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.ExamenPractico.service.EstudianteService;

@Controller
@Slf4j
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/")
    public String inicio(Model model) {
        var estudiantes = estudianteService.getEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "index";
    }

    @GetMapping("/estudiante/nuevo")
    public String estudianteNuevo(Estudiante estudiante) {
        return "modifica_estudiante";
    }

    @PostMapping("/estudiante/guardar")
    public String estudianteGuardar(Estudiante estudiante) {
        estudianteService.save(estudiante);
        return "redirect:/";
    }

    @GetMapping("/estudiante/eliminar/{idEstudiante}")
    public String clienteEliminar(Estudiante estudiante) {
        estudianteService.delete(estudiante);
        return "redirect:/";
    }
    
    @GetMapping("/estudiante/modificar/{idEstudiante}")
    public String estudianteModificar(Estudiante estudiante,Model model) {
        estudiante = estudianteService.getEstudiante(estudiante);
        model.addAttribute("estudiante", estudiante);
        return "modifica_estudiante";
    }
    
}
