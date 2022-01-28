package com.plataforma.curso.interfaces;

import com.plataforma.curso.domains.Curso;

import java.util.List;

public interface CursoInterface {

    Curso criar(Curso curso);

    Curso atualizar(Curso curso, Long id);

    void deletar(Long id);

    List<Curso> listar();

    Curso obter(Long id);
}
