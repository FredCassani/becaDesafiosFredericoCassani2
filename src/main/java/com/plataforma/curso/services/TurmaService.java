package com.plataforma.curso.services;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.interfaces.TurmaInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class TurmaService  implements TurmaInterface {


    public Turma criar(Turma turma) {
        turma.setId(8L);
        return turma;

    }

    public Turma atualizar(Turma turma, Long id) {
        turma.setId(id);
        return turma;
    }

    public void deletar(Long id) {

    }


    public List<Turma> listar() {
        Turma turma1 = new Turma();
        turma1.setId(10L);
        turma1.setNome("turmaA");

        Turma turma2 = new Turma();
        turma2.setId(11L);
        turma2.setNome("turmaB");

        return List.of(
                turma1,
                turma2
        );
    }

    public Turma obter(Long id) {
        Turma turma1 = new Turma();
        turma1.setId(10L);
        turma1.setNome("turmaA");

        return turma1;

    }
}
