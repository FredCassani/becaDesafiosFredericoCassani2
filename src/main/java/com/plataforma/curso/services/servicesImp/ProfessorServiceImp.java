package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Professor;
import com.plataforma.curso.dtos.requests.ProfessorRequest;
import com.plataforma.curso.dtos.responses.ProfessorResponse;
import com.plataforma.curso.mappers.MapperProfessorAtualizar;
import com.plataforma.curso.mappers.MapperProfessorRequest;
import com.plataforma.curso.mappers.MapperProfessorResponse;
import com.plataforma.curso.repositories.ProfessorRepository;
import com.plataforma.curso.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImp implements ProfessorService {

    private final ProfessorRepository professorRepository;
    private final MapperProfessorRequest mapperProfessorRequest;
    private final MapperProfessorResponse mapperProfessorResponse;
    private final MapperProfessorAtualizar mapperProfessorAtualizar;

    public ProfessorResponse criar(ProfessorRequest professorRequest) {

        Professor professorCriado = mapperProfessorRequest.toModel(professorRequest);
        professorRepository.save(professorCriado);
        return mapperProfessorResponse.toResponse(professorCriado);
    }

    public ProfessorResponse atualizar(ProfessorRequest professorRequest, Long id) {

        Professor professorAtualizado = professorRepository.findById(id).get();
        mapperProfessorAtualizar.atualizar(professorRequest, professorAtualizado);
        professorRepository.save(professorAtualizado);

        return mapperProfessorResponse.toResponse(professorAtualizado);
    }
        public void deletar(Long id) {

        professorRepository.deleteById(id);

    }

    public List<ProfessorResponse> listar() {

        List<Professor> listaDeProfessores = professorRepository.findAll();
        List<ProfessorResponse> listaResponse = new ArrayList<>();
        listaDeProfessores.stream().forEach(professor ->
                listaResponse.add(mapperProfessorResponse.toResponse(professor)));
        return listaResponse;

    }
    public ProfessorResponse obter(Long id) {
      Professor professorObtido = professorRepository.findById(id).get();

      return mapperProfessorResponse.toResponse(professorObtido);

    }
}
