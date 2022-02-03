package com.plataforma.curso.services;

import com.plataforma.curso.domains.Aluno;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AlunoService {

    Aluno criar(Aluno aluno);

    Aluno atualizar(Aluno aluno, Long id);

    ResponseEntity<?> deletar(Long id);

    List<Aluno> listar();

    Aluno obter(Long id);
}

