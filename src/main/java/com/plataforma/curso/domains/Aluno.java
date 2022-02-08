package com.plataforma.curso.domains;

import com.plataforma.curso.dtos.requests.AlunoRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer matricula;

    @NotBlank
    private String nome;

    private Long dataNascimento;
    private String sexo;
    private Long telefone;
    private String email;

    public Aluno(AlunoRequest alunoRequest) {
    }
}
