package com.aluracurso.screenmatch_frases.controller;

import com.aluracurso.screenmatch_frases.dto.FrasesDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// modelo Rest: Leer la documentación
@RestController
@RequestMapping("/series")

public class FrasesController {
    // Mapeo de la pagina
    @GetMapping("/top5")
    public List<FrasesDTO> obtenerFrasesAleatorias() {
        return List.of();
    }

}
