package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.repositories.TurmaRepository;
import com.plataforma.curso.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaServiceImp implements TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public Turma criar(Turma turma) {
        Turma turmaCriado = turmaRepository.save(turma);
        return turma;

    }

    public Turma atualizar(Turma turma, Long id) {
        Turma turmaAtualizado = this.obter(id);
        turmaAtualizado.setId(id);
        turmaAtualizado.setNome(turma.getNome());
        turmaAtualizado.setDataInicio(turma.getDataInicio());
        turmaAtualizado.setDataTermino(turma.getDataTermino());
        turmaAtualizado.setProfessor(turma.getProfessor());
        turmaAtualizado.setCurso(turma.getCurso());
        turmaRepository.save(turmaAtualizado);

        return turmaAtualizado;
    }

    public void deletar(Long id) {

        turmaRepository.deleteById(id);

    }


    public List<Turma> listar() {

        return turmaRepository.findAll();
    }

    public Turma obter(Long id) {

        Turma turmaObtida = turmaRepository.findById(id).get();

        return turmaObtida;



    }
}
