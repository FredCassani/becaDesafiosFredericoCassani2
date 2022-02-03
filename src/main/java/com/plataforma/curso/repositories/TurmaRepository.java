package com.plataforma.curso.repositories;

import com.plataforma.curso.domains.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
