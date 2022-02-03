package com.plataforma.curso.services;

import com.plataforma.curso.domains.Curso;
import java.util.List;

public interface CursoService {

    Curso criar(Curso curso);

    Curso atualizar(Curso curso, Long id);

    void deletar(Long id);

    List<Curso> listar();

    Curso obter(Long id);
}
