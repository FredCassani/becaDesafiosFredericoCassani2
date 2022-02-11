package com.plataforma.curso.dtos.requests;

import com.plataforma.curso.dtos.responses.CursoResponse;
import com.plataforma.curso.dtos.responses.ProfessorResponse;
import lombok.Data;

@Data
public class TurmaRequest {
    private String nome;
    private ProfessorRequest professor;
    private CursoRequest curso;
}
