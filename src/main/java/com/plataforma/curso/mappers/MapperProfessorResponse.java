package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.responses.ProfessorResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProfessorResponse {
    public ProfessorResponse toResponse(Professor professor);
}
