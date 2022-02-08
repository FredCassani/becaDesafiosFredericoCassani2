package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.requests.CursoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperCursoAtualizar {
    public void Atualizar(CursoRequest cursoRequest , @MappingTarget Curso curso);
}
