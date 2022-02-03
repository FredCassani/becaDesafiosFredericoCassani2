package com.plataforma.curso.services;

import com.plataforma.curso.domains.Turma;
import java.util.List;

public interface TurmaService {

    Turma criar(Turma turma);

    Turma atualizar(Turma turma, Long id);

    void deletar(Long id);

    List<Turma> listar();

    Turma obter(Long id);
}
