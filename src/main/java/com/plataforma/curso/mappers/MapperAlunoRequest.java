package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.requests.AlunoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoRequest {
    public Aluno toModel(AlunoRequest alunoRequest);

}
