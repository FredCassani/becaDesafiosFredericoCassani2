package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.requests.CursoRequest;
import com.plataforma.curso.dtos.responses.CursoResponse;
import com.plataforma.curso.services.servicesImp.CursoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/curso")
@RestController
public class CursoController {

    @Autowired
    private CursoServiceImp cursoService;

    @PostMapping
    public ResponseEntity<CursoResponse> criar(@RequestBody CursoRequest curso) {
        CursoResponse cursoCriar = cursoService.criar(curso);
        return ResponseEntity.created(null).body(cursoCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<CursoResponse> atualizar(@RequestBody CursoRequest curso, @PathVariable Long id) {
        CursoResponse cursoAtualizar = cursoService.atualizar(curso, id);
        return ResponseEntity.ok(cursoAtualizar);

   }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        cursoService.deletar(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<CursoResponse>> listar() {
        List listaAluno = cursoService.listar();

        return ResponseEntity.ok(listaAluno);

    }

    @GetMapping("{id}")
    public ResponseEntity<CursoResponse> obter(@PathVariable Long id) {
       CursoResponse obterCurso = cursoService.obter(id);

        return ResponseEntity.ok(obterCurso);

    }
}
