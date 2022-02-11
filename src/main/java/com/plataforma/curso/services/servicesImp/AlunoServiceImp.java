package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Aluno;
import com.plataforma.curso.dtos.requests.AlunoRequest;
import com.plataforma.curso.dtos.responses.AlunoResponse;
import com.plataforma.curso.mappers.MapperAlunoAtualizar;
import com.plataforma.curso.mappers.MapperAlunoRequest;
import com.plataforma.curso.mappers.MapperAlunoResponse;
import com.plataforma.curso.repositories.AlunoRepository;
import com.plataforma.curso.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImp implements AlunoService {

    private final AlunoRepository alunoRepository;
    private final MapperAlunoRequest mapperAlunoRequest;
    private final MapperAlunoResponse mapperAlunoResponse;
    private final MapperAlunoAtualizar mapperAlunoAtualizar;

    public AlunoResponse criar(AlunoRequest  alunoRequest) {
       // if (alunoRequest.getAluno().length() < 3 ) {
        //throw new TamanhoNaoValidoException ("Descrição não pode ter menos do que 4 caracteres");

   // }

        Aluno aluno = mapperAlunoRequest.toModel(alunoRequest);

        alunoRepository.save(aluno);

        AlunoResponse alunoconvertido2 = mapperAlunoResponse.toResponse(aluno);

        return alunoconvertido2;
    }

    public AlunoResponse atualizar(AlunoRequest alunoRequest ,  Long id) {
        Aluno alunoListado = alunoRepository.findById(id).get();

        mapperAlunoAtualizar.atualizar(alunoRequest , alunoListado);

        alunoRepository.save(alunoListado);

        return mapperAlunoResponse.toResponse(alunoListado);
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

    public List<AlunoResponse> listar() {
        List<Aluno> listaAluno =  alunoRepository.findAll();
        List<AlunoResponse> alunoResponses = new ArrayList<>();
        listaAluno.stream().forEach(aluno -> {
            alunoResponses.add(mapperAlunoResponse.toResponse(aluno));
        });

        return alunoResponses;
    }

    public AlunoResponse obter(Long id) {
        Aluno alunoObtido = alunoRepository.findById(id).get();
        AlunoResponse alunoResponse = mapperAlunoResponse.toResponse(alunoObtido);
        return alunoResponse;
    }
}


