package com.plataforma.curso.services;

import com.plataforma.curso.domains.Professor;
import java.util.List;

public interface ProfessorService {

    Professor criar(Professor professor);

    Professor atualizar(Professor professor, Long id);

    void deletar(Long id);

    List<Professor> listar();

    Professor obter(Long id);
}
