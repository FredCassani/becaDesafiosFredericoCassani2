package com.plataforma.curso.domains;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne
    private Professor professor;
    @OneToOne
    private Curso curso;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

   }
