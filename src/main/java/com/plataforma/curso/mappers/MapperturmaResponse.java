package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.responses.TurmaResponse;
import lombok.Data;

@Data
public class MapperturmaResponse {
    private String nome;

    private Professor professor;

    private Curso curso;

    public TurmaResponse toResponse(Turma turma) {
        return null;
    }
}
