package com.plataforma.curso.services;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.requests.ProfessorRequest;
import com.plataforma.curso.dtos.responses.ProfessorResponse;

import java.util.List;

public interface ProfessorService {

    ProfessorResponse criar(ProfessorRequest professor);

    ProfessorResponse atualizar(ProfessorRequest professor, Long id);

    void deletar(Long id);

    List<ProfessorResponse> listar();

    ProfessorResponse obter(Long id);
}
