package com.plataforma.curso.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer matricula;
    private String nome;
    private Long dataNascimento;
    private String sexo;
    private Long telefone;
    private String email;
    private String disciplina;
}
