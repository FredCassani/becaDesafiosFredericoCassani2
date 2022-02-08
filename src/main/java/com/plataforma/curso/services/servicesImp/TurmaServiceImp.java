package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Turma;
import com.plataforma.curso.dtos.requests.TurmaRequest;
import com.plataforma.curso.dtos.responses.TurmaResponse;
import com.plataforma.curso.mappers.*;
import com.plataforma.curso.repositories.TurmaRepository;
import com.plataforma.curso.services.TurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TurmaServiceImp implements TurmaService {

    private final TurmaRepository turmaRepository;
    private final TurmaRequest turmaRequest;
    private final MapperTurmaRequest mapperTurmaRequest;
    private final MapperTurmaAtualizar mapperTurmaAtualizar;
    private final MapperturmaResponse mapperturmaResponse;


    public TurmaResponse  criar(TurmaRequest turmaRequest) {
        Turma turma = mapperTurmaRequest.toModel(turmaRequest);
        Turma turmaCriado = turmaRepository.save(turma);
        TurmaResponse turmaResponse = mapperturmaResponse.toResponse(turma);
        return turmaResponse;

    }

    public TurmaResponse atualizar(TurmaRequest turma, Long id) {
        Turma turmaAtualizado = turmaRepository.findById(id).get();
        mapperTurmaAtualizar.Atualizar(turmaRequest, turmaAtualizado);
        turmaRepository.save(turmaAtualizado);

        return mapperturmaResponse.toResponse(turmaAtualizado);
    }


    public void deletar(Long id) {

        turmaRepository.deleteById(id);
    }


    public List<TurmaResponse> listar() {
        List<Turma> listaTurma = turmaRepository.findAll();
        List<TurmaResponse> turmaResponses = new ArrayList<>();
        listaTurma.stream().forEach(turma ->
                turmaResponses.add(mapperturmaResponse.toResponse(turma)));


        return turmaResponses;
    }

    public TurmaResponse obter(Long id) {

        Turma turmaObtida = turmaRepository.findById(id).get();
        TurmaResponse turmaResponse = mapperturmaResponse.toResponse(turmaObtida);

        return turmaResponse;

    }
}
