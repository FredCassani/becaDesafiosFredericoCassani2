package com.plataforma.curso.controllers;

import com.plataforma.curso.domains.Curso;
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
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        Curso cursoCriar = cursoService.criar(curso);
        return ResponseEntity.created(null).body(cursoCriar);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Curso> atualizar(@RequestBody Curso curso, @PathVariable Long id) {
        Curso cursoAtualizar = cursoService.atualizar(curso, id);
        return ResponseEntity.ok(curso);

   }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        cursoService.deletar(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Curso>> listar() {
        List listaAluno = cursoService.listar();

        return ResponseEntity.ok(listaAluno);

    }

    @GetMapping("{id}")
    public ResponseEntity<Curso> obter(@PathVariable Long id) {
       Curso obterCurso = cursoService.obter(id);

        return ResponseEntity.ok(obterCurso);

    }
}
