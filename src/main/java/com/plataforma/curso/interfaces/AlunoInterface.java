package com.plataforma.curso.interfaces;

import com.plataforma.curso.domains.Aluno;

import java.util.List;

public interface AlunoInterface {

    Aluno criar(Aluno aluno);

    Aluno atualizar(Aluno aluno, Long id);

    void deletar(Long id);

    List<Aluno> listar();

    Aluno obter(Long id);
}
