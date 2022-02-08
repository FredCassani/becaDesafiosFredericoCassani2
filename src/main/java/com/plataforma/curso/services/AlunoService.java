package com.plataforma.curso.services;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.requests.AlunoRequest;
import com.plataforma.curso.dtos.responses.AlunoResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AlunoService {

    AlunoResponse criar(AlunoRequest alunoRequest);

    AlunoResponse atualizar(AlunoRequest alunoRequest , Long id);

    ResponseEntity<?> deletar(Long id);

    List<AlunoResponse> listar();

    AlunoResponse obter(Long id);
}

