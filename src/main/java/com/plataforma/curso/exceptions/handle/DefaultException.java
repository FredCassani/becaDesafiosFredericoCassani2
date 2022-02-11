package com.plataforma.curso.exceptions.handle;

import jdk.jshell.Snippet;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DefaultException {
    private Integer status;
    private String mensagem;
    private LocalDateTime dataHora;

}
