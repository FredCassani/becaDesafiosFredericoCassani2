package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.requests.ProfessorRequest;
import com.plataforma.curso.dtos.responses.ProfessorResponse;
import com.plataforma.curso.services.servicesImp.ProfessorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/professor")
@RestController
public class ProfessorControler {
    private ProfessorServiceImp professorService;

    @PostMapping
    public ResponseEntity<ProfessorResponse> criar(@RequestBody ProfessorRequest professor) {

        ProfessorResponse professorCriar = professorService.criar(professor);

        return ResponseEntity.created(null).body(professorCriar);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProfessorResponse> atualizar(@RequestBody ProfessorRequest professor, @PathVariable Long id) {

        ProfessorResponse professorAtualizar = professorService.atualizar(professor, id);

        return ResponseEntity.ok(professorAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        professorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProfessorResponse>> listar() {

         List listaProfessor = professorService.listar();

        return ResponseEntity.ok(listaProfessor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorResponse> obter(@PathVariable Long id) {

        ProfessorResponse professorObter = professorService.obter(id);

        return ResponseEntity.ok(professorObter);
    }
}
