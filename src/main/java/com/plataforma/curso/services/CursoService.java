package com.plataforma.curso.services;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.interfaces.CursoInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class CursoService implements CursoInterface {

    public Curso criar(Curso curso) {
        curso.setId(4L);
        return curso;
    }

    public Curso atualizar(Curso curso, Long id) {
        curso.setId(id);
        return curso;
    }

    public void deletar(Long id) {

    }

    public List<Curso> listar() {
        Curso curso1 = new Curso();
        curso1.setId(1L);
        curso1.setNome("Java");

        Curso curso2 = new Curso();
        curso2.setNome("Banco de Dados");
        curso2.setId(2L);

        return List.of(
                curso1,
                curso2
        );
    }

    public Curso obter(Long id) {
        Curso curso3 = new Curso();
        curso3.setId(id);
        curso3.setNome("Front end");

        return curso3;
    }
}
