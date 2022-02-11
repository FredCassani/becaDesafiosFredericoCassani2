package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.requests.ProfessorRequest;
import org.mapstruct.Mapper;
@Mapper
public interface MapperProfessorRequest {
    public Professor toModel(ProfessorRequest professorRequest);
}
