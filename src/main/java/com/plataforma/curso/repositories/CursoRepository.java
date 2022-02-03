package com.plataforma.curso.repositories;

import com.plataforma.curso.domains.Curso;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface  CursoRepository extends JpaRepository<Curso, Long>{

}
