package com.plataforma.curso.services;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.requests.TurmaRequest;
import com.plataforma.curso.dtos.responses.TurmaResponse;

import java.util.List;

public interface TurmaService {

    TurmaResponse criar(TurmaRequest turma);

    TurmaResponse atualizar(TurmaRequest turma, Long id);

    void deletar(Long id);

    List<TurmaResponse> listar();

    TurmaResponse obter(Long id);
}
