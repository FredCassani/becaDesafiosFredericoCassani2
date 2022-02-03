package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.services.servicesImp.ProfessorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/professor")
@RestController
public class ProfessorControler {

    @Autowired
    private ProfessorServiceImp professorService;

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        Professor professorCriar = professorService.criar(professor);
        return ResponseEntity.created(null).body(professorCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Professor> atualizar(@RequestBody Professor professor, @PathVariable Long id) {
        Professor professorAtualizar = professorService.atualizar(professor, id);
        return ResponseEntity.ok(professorAtualizar);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        professorService.deletar(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Professor>> listar() {
         List listaProfessor = professorService.listar();

        return ResponseEntity.ok(listaProfessor);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> obter(@PathVariable Long id) {
        Professor professorObter = professorService.obter(id);

        return ResponseEntity.ok(professorObter);
    }
}
