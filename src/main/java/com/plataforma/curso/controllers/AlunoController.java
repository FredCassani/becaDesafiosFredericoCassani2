package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.requests.AlunoRequest;
import com.plataforma.curso.dtos.responses.AlunoResponse;
import com.plataforma.curso.services.servicesImp.AlunoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/aluno")
@RestController
public class AlunoController {

    @Autowired
    private AlunoServiceImp alunoServiceImp;

    @PostMapping
    public ResponseEntity<AlunoResponse> criar(@RequestBody @Valid AlunoRequest postAlunoRequest) {
        AlunoResponse alunoCriar = alunoServiceImp.criar(postAlunoRequest);

        return ResponseEntity.created(null).body(alunoCriar);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AlunoResponse> atualizar(@RequestBody AlunoRequest aluno, @PathVariable Long id) {
        AlunoResponse alunoAtualizar = alunoServiceImp.atualizar(aluno, id);

        return ResponseEntity.ok(alunoAtualizar);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
       alunoServiceImp.deletar(id);
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponse>> listar() {

       List listaAluno = alunoServiceImp.listar();

        return ResponseEntity.ok(listaAluno);

    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponse> obter(@PathVariable Long id) {

        AlunoResponse alunoResponse = alunoServiceImp.obter(id);

        return ResponseEntity.ok(alunoResponse);

    }
}
