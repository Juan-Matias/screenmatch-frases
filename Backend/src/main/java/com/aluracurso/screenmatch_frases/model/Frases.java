package com.aluracurso.screenmatch_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frases {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;

        private String titulo;
        private String frase;
        private String personaje;
        private String poster;

    }

