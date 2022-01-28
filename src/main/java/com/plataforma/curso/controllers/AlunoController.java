package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aluno")
@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno alunoCriar = alunoService.criar(aluno);
        return ResponseEntity.created(null).body(alunoCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno, @PathVariable Long id) {
        Aluno alunoAtualizar = alunoService.atualizar(aluno, id);
        return ResponseEntity.ok(alunoAtualizar);


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
       alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> listar() {

       List listaAluno = alunoService.listar();

        return ResponseEntity.ok(listaAluno);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> obter(@PathVariable Long id) {

        Aluno alunoObter = alunoService.obter(id);

        return ResponseEntity.ok(alunoObter);


    }
}
