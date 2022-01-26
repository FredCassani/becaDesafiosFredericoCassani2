package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/professor")
@RestController
public class ProfessorControler {

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        professor.setId(5L);
        return ResponseEntity.created(null).body(professor);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Professor> atualizar(@RequestBody Professor professor, @PathVariable Long id) {
        professor.setId(id);
        return ResponseEntity.ok(professor);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Professor>> listar() {
        Professor professor1 = new Professor();
        professor1.setId(6L);
        professor1.setNome("Wesley");

        Professor professor2 = new Professor();
        professor2.setId(7L);
        professor2.setNome("Brandao");

        return ResponseEntity.ok(List.of(
                professor1, professor2
        ));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> obter(@PathVariable Long id) {
        Professor professor3 = new Professor();
        professor3.setId(7L);
        professor3.setNome("Léo");

        return ResponseEntity.ok(professor3);

    }
}
