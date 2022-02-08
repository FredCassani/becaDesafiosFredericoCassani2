package com.plataforma.curso.dtos.requests;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.domains.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TurmaRequest {
    private String nome;
    private Professor professor;
    private Curso curso;
}
