package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.services.servicesImp.AlunoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aluno")
@RestController
public class AlunoController {

    @Autowired
    private AlunoServiceImp alunoServiceImp;

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno alunoCriar = alunoServiceImp.criar(aluno);
        return ResponseEntity.created(null).body(alunoCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno, @PathVariable Long id) {
        Aluno alunoAtualizar = alunoServiceImp.atualizar(aluno, id);
        return ResponseEntity.ok(alunoAtualizar);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
       return alunoServiceImp.deletar(id);
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> listar() {

       List listaAluno = alunoServiceImp.listar();

        return ResponseEntity.ok(listaAluno);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> obter(@PathVariable Long id) {

        Aluno alunoObter = alunoServiceImp.obter(id);

        return ResponseEntity.ok(alunoObter);

    }
}
