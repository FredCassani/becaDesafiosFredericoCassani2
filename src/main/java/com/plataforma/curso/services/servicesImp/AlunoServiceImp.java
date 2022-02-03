package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.repositories.AlunoRepository;
import com.plataforma.curso.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AlunoServiceImp implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno criar(Aluno aluno) {
        Aluno alunoCriado = alunoRepository.save(aluno);
        return alunoCriado;
    }

    public Aluno atualizar(Aluno aluno, Long id) {
        Aluno alunoListado = this.obter(id);
        alunoListado.setId(id);
        alunoListado.setNome(aluno.getNome());
        alunoListado.setEmail(aluno.getEmail());
        alunoListado.setSexo(aluno.getSexo());
        alunoListado.setMatricula(aluno.getMatricula());
        alunoListado.setDataNascimento(aluno.getDataNascimento());
        alunoListado.setTelefone(aluno.getTelefone());

        alunoRepository.save(alunoListado);
        return alunoListado;

    }

    public ResponseEntity<?> deletar(Long id) {
        return alunoRepository
                .findById(id)
                .map(aluno -> {
                    alunoRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());

    }

    public List<Aluno> listar() {

        return alunoRepository.findAll();
    }

    public Aluno obter(Long id) {
        Aluno alunoObtido = alunoRepository.findById(id).get();

        return alunoObtido;
    }
}


