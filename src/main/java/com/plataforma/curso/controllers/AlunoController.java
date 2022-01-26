package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/aluno")
@RestController
public class AlunoController {

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        aluno.setId(1L);
        return ResponseEntity.created(null).body(aluno);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno, @PathVariable Long id) {
        aluno.setId(id);
        return ResponseEntity.ok(aluno);


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listar() {
        Aluno aluno1 = new Aluno();
        aluno1.setId(2L);
        aluno1.setNome("Fred");

        Aluno aluno2 = new Aluno();
        aluno2.setId(3L);
        aluno2.setNome("Joao");

        return ResponseEntity.ok(List.of(aluno1, aluno2));


    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> obter(@PathVariable Long id) {
        Aluno aluno3 = new Aluno();
        aluno3.setId(id);
        aluno3.setNome("Pedro");

        return ResponseEntity.ok(aluno3);


    }
}
