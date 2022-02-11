package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.requests.CursoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoRequest {
    public Curso toModel(CursoRequest cursoRequest);
}
