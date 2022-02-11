package com.plataforma.curso.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoRequest {

    public boolean getAluno;
    private Integer matricula;
    @NotBlank(message = "Campo matéria nao pode ser branco")
    @Size(min = 3, message = "Descrição não pode ter menos do que 4 caracteres")
    private String nome;
    public CharSequence getAluno() {
        return null;
    }
}
