package com.plataforma.curso.repositories;

import com.plataforma.curso.domains.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
