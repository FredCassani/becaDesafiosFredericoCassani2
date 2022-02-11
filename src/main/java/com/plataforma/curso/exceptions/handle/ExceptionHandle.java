package com.plataforma.curso.exceptions.handle;

import com.plataforma.curso.exceptions.TamanhoNaoValidoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DefaultException> handle(MethodArgumentNotValidException e) {
        DefaultException defaultException = new DefaultException();

       // e.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage();

        defaultException.setMensagem(e.getBindingResult().getAllErrors().stream().findFirst().get().getDefaultMessage());
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);

    }

}
