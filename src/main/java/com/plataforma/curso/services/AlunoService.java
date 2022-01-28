package com.plataforma.curso.services;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.interfaces.AlunoInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class AlunoService implements AlunoInterface {

        public Aluno criar(Aluno aluno) {
        aluno.setId(1L);
        return aluno;
    }
        public Aluno atualizar(Aluno aluno, Long id) {
        aluno.setId(id);
        return aluno;

    }
        public void  deletar(Long id) {

    }
        public List<Aluno> listar() {
        Aluno aluno1 = new Aluno();
        aluno1.setId(2L);
        aluno1.setNome("Fred");

        Aluno aluno2 = new Aluno();
        aluno2.setId(3L);
        aluno2.setNome("Joao");

        return List.of(aluno1, aluno2);
    }
        public Aluno obter(Long id) {
        Aluno aluno3 = new Aluno();
        aluno3.setId(id);
        aluno3.setNome("Pedro");

        return aluno3;
    }
}


