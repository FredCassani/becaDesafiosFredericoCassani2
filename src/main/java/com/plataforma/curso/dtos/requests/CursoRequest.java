package com.plataforma.curso.dtos.requests;

import lombok.Data;

@Data
public class CursoRequest {
    private Long id;
    private String nome;
    private String descricao;

}
