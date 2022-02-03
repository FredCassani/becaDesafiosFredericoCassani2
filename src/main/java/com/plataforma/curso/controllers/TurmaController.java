package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.services.servicesImp.TurmaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/turma")
@RestController
public class TurmaController {

    @Autowired
    private TurmaServiceImp turmaService;

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        Turma turmaCriar = turmaService.criar(turma);
        return ResponseEntity.created(null).body(turmaCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Turma> atualizar(@RequestBody Turma turma, @PathVariable Long id) {
        Turma turmaAtualizar = turmaService.atualizar(turma, id);
        return ResponseEntity.ok(turmaAtualizar);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        turmaService.deletar(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Turma>> listar() {
 ;      List listaTurma = turmaService.listar();

       return ResponseEntity.ok(listaTurma);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> obter(@PathVariable Long id) {
      Turma turmaObter = turmaService.obter(id);

        return ResponseEntity.ok(turmaObter);

    }
}
