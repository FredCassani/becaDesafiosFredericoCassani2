package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.responses.AlunoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoResponse {
    public AlunoResponse toResponse(Aluno aluno);

}
