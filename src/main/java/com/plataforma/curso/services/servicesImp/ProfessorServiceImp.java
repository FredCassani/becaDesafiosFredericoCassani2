package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.repositories.ProfessorRepository;
import com.plataforma.curso.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImp implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor criar(Professor professor) {

        Professor professorCriado = professorRepository.save(professor);
        return professorCriado;
    }

    public Professor atualizar(Professor professor, Long id) {

        Professor professorAtualizado = this.obter(id);
        professorAtualizado.setId(id);
        professorAtualizado.setNome(professor.getNome());
        professorAtualizado.setDataNascimento(professor.getDataNascimento());
        professorAtualizado.setEmail(professor.getEmail());
        professorAtualizado.setSexo(professor.getSexo());
        professorAtualizado.setDisciplina(professor.getDisciplina());
        professorAtualizado.setMatricula(professor.getMatricula());
        professorAtualizado.setTelefone(professor.getTelefone());
        professorRepository.save(professorAtualizado);

        return professorAtualizado;
    }
        public void deletar(Long id) {

        professorRepository.deleteById(id);

    }

    public List<Professor> listar() {

        return professorRepository.findAll();
    }

    public Professor obter(Long id) {
      Professor professorObtido = professorRepository.findById(id).get();

      return professorObtido;

    }
}
