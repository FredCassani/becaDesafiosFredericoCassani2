package com.plataforma.curso.mappers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.requests.AlunoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperAlunoAtualizar {
    public void atualizar(AlunoRequest alunoRequest , @MappingTarget Aluno aluno);
}
