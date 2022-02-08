package com.plataforma.curso.dtos.responses;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.domains.Professor;
import lombok.Data;


import javax.persistence.OneToOne;
@Data

public class TurmaResponse {
    private String nome;
    private Professor professor;
    private Curso curso;
}
