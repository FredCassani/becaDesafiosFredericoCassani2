package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/curso")
@RestController
public class CursoController {

    @PostMapping
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        curso.setId(4L);
        return ResponseEntity.created(null).body(curso);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Curso> atualizar(@RequestBody Curso curso, @PathVariable Long id) {
        curso.setId(id);
        return ResponseEntity.ok(curso);

   }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Curso>> listar() {
        Curso curso1 = new Curso();
        curso1.setId(1L);
        curso1.setNome("Java");

        Curso curso2 = new Curso();
        curso2.setNome("Banco de Dados");
        curso2.setId(2L);

        return ResponseEntity.ok(List.of(
                curso1, curso2
        ));

    }

    @GetMapping("{id}")
    public ResponseEntity<Curso> obter(@PathVariable Long id) {
        Curso curso3 = new Curso();
        curso3.setId(id);
        curso3.setNome("Front end");

        return ResponseEntity.ok(curso3);


    }
}
