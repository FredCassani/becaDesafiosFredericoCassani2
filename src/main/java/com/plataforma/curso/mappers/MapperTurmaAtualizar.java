package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.requests.TurmaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperTurmaAtualizar {
    public void Atualizar(TurmaRequest cursoRequest, @MappingTarget Turma turma);
}
