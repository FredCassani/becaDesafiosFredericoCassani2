package com.plataforma.curso.interfaces;

import com.plataforma.curso.domains.Professor;

import java.util.List;

public interface ProfessorInterface {

    Professor criar(Professor professor);

    Professor atualizar(Professor professor, Long id);

    void deletar(Long id);

    List<Professor> listar();

    Professor obter(Long id);
}
