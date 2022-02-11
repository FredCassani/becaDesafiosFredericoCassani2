package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.responses.TurmaResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperturmaResponse {
    public TurmaResponse toResponse(Turma turma);
   }
