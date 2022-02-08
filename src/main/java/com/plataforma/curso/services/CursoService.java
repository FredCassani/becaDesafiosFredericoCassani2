package com.plataforma.curso.services;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.requests.CursoRequest;
import com.plataforma.curso.dtos.responses.CursoResponse;

import java.util.List;

public interface CursoService {

    CursoResponse criar(CursoRequest curso);

    CursoResponse atualizar(CursoRequest curso, Long id);

    void deletar(Long id);

    List<CursoResponse> listar();

    CursoResponse obter(Long id);
}
