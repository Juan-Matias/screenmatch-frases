package com.aluracurso.screenmatch_frases.model;

import com.aluracurso.screenmatch_frases.dto.FrasesDTO;
import com.aluracurso.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FrasesDTO obtenerFrasesAleatoria() {
        Frases frase = repository.obtenerFrasesAleatoria();
        return new FrasesDTO(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonaje(),
                frase.getPoster());
    }


}
