package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.repositories.CursoRepository;
import com.plataforma.curso.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CursoServiceImp implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso criar(Curso curso) {

        Curso cursoCriado = cursoRepository.save(curso);
        return cursoCriado;
    }

    public Curso atualizar(Curso curso, Long id) {
        Curso cursoAtualizado = this.obter(id);
        cursoAtualizado.setId(id);
        cursoAtualizado.setNome(curso.getNome());
        cursoAtualizado.setDataInicio(curso.getDataInicio());
        cursoAtualizado.setDescricao(curso.getDescricao());
        cursoAtualizado.setDataTermino(curso.getDataTermino());
        cursoAtualizado.setProfessor(curso.getProfessor());
        cursoAtualizado.setQuantidadeAluno(curso.getQuantidadeAluno());
        cursoRepository.save(cursoAtualizado);
        return cursoAtualizado;
    }

    public void deletar(Long id) {

        cursoRepository.deleteById(id);

    }

    public List<Curso> listar() {

        return cursoRepository.findAll();
    }

    public Curso obter(Long id) {
        Curso cursoObter = cursoRepository.findById(id).get();

        return cursoObter;
    }
}
