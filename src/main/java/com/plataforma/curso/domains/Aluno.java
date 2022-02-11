package com.plataforma.curso.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer matricula;
    private String nome;
    private Long dataNascimento;
    private String sexo;
    private Long telefone;
    private String email;

}
