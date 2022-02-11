package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.responses.CursoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoResponse {
    public CursoResponse toResponse(Curso curso);
}
