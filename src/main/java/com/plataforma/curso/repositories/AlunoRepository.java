package com.plataforma.curso.repositories;

import com.plataforma.curso.domains.Aluno;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface  AlunoRepository extends JpaRepository<Aluno, Long> {
}
