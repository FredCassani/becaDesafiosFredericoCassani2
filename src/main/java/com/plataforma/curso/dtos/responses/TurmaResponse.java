package com.plataforma.curso.dtos.responses;

import lombok.Data;

@Data
public class TurmaResponse {
    private String nome;
    private ProfessorResponse professor;
    private CursoResponse curso;
}
