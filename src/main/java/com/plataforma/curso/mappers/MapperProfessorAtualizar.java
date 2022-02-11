package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.requests.ProfessorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperProfessorAtualizar {
    public void atualizar(ProfessorRequest professorRequest, @MappingTarget Professor professor);
}
