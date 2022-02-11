package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.requests.TurmaRequest;
import com.plataforma.curso.dtos.responses.TurmaResponse;
import com.plataforma.curso.services.servicesImp.TurmaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/turma")
@RestController
public class TurmaController {
    private TurmaServiceImp turmaService;

    @PostMapping
    public ResponseEntity<TurmaResponse> criar(@RequestBody TurmaRequest turma) {

        TurmaResponse turmaCriar = turmaService.criar(turma);

        return ResponseEntity.created(null).body(turmaCriar);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TurmaResponse> atualizar(@RequestBody TurmaRequest turma, @PathVariable Long id) {

        TurmaResponse turmaAtualizar = turmaService.atualizar(turma, id);

        return ResponseEntity.ok(turmaAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        turmaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<TurmaResponse>> listar() {

       List listaTurma = turmaService.listar();

       return ResponseEntity.ok(listaTurma);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TurmaResponse> obter(@PathVariable Long id) {

      TurmaResponse turmaObter = turmaService.obter(id);

        return ResponseEntity.ok(turmaObter);
    }
}
