package com.aluracurso.screenmatch_frases.controller;

import com.aluracurso.screenmatch_frases.dto.FrasesDTO;
import com.aluracurso.screenmatch_frases.model.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// modelo Rest: Leer la documentación
@RestController
@RequestMapping("/series")

public class FrasesController {
    @Autowired
    FraseService servicio;
    // Mapeo de la pagina
    @GetMapping("/frases")
    public FrasesDTO obtenerFrasesAleatorias() {
        return servicio.obtenerFrasesAleatoria();
    }

}
