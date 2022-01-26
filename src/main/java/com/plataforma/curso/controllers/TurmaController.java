package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Turma;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/turma")
@RestController
public class TurmaController {

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        turma.setId(8L);
        return ResponseEntity.created(null).body(turma);


    }

    @PatchMapping("/{id}")
    public ResponseEntity<Turma> atualizar(@RequestBody Turma turma, @PathVariable Long id) {
        turma.setId(id);
        return ResponseEntity.ok(turma);


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Turma>> listar() {
       Turma turma1 = new Turma();
       turma1.setId(10L);
       turma1.setNome("turmaA");

       Turma turma2 = new Turma();
       turma2.setId(11L);
       turma2.setNome("turmaB");

       return ResponseEntity.ok(List.of(
               turma1, turma2
       ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> obter(@PathVariable Long id) {
        Turma turma1 = new Turma();
        turma1.setId(10L);
        turma1.setNome("turmaA");

        return ResponseEntity.ok(turma1);

    }
}
