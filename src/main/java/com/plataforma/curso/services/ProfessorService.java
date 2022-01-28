package com.plataforma.curso.services;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.interfaces.ProfessorInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ProfessorService implements ProfessorInterface {

    public Professor criar(Professor professor) {
        professor.setId(5L);
        return professor;
    }

    public Professor atualizar(Professor professor, Long id) {
        professor.setId(id);
        return professor;
    }
        public void deletar(Long id) {

    }

    public List<Professor> listar() {
        Professor professor1 = new Professor();
        professor1.setId(6L);
        professor1.setNome("Wesley");

        Professor professor2 = new Professor();
        professor2.setId(7L);
        professor2.setNome("Brandao");

        return List.of(
                professor1,
                professor2
        );
    }

    public Professor obter(Long id) {
        Professor professor3 = new Professor();
        professor3.setId(7L);
        professor3.setNome("Léo");

        return professor3;

    }
}
