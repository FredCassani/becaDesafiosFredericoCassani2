package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.requests.TurmaRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperTurmaRequest {
    public Turma toModel (TurmaRequest turmaRequest);
}
