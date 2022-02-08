package com.plataforma.curso.services.servicesImp;

import com.plataforma.curso.domains.Curso;
import com.plataforma.curso.dtos.requests.CursoRequest;
import com.plataforma.curso.dtos.responses.CursoResponse;
import com.plataforma.curso.mappers.MapperCursoAtualizar;
import com.plataforma.curso.mappers.MapperCursoRequest;
import com.plataforma.curso.mappers.MapperCursoResponse;
import com.plataforma.curso.repositories.CursoRepository;
import com.plataforma.curso.services.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImp implements CursoService {

    private final CursoRepository cursoRepository;
    private final MapperCursoRequest mapperCursoRequest;
    private final MapperCursoResponse mapperCursoResponse;
    private final MapperCursoAtualizar mapperCursoAtualizar;

    public CursoResponse criar(CursoRequest curso) {

        Curso cursoCriado = mapperCursoRequest.toModel(curso);
        cursoRepository.save(cursoCriado);

        return mapperCursoResponse.toResponse(cursoCriado);
    }

    public CursoResponse atualizar(CursoRequest curso, Long id) {
        Curso cursoAtualizado = cursoRepository.findById(id).get();
        mapperCursoAtualizar.Atualizar(curso , cursoAtualizado);

        cursoRepository.save(cursoAtualizado);
        return mapperCursoResponse.toResponse(cursoAtualizado);
    }

    public void deletar(Long id) {

        cursoRepository.deleteById(id);

    }

    public List<CursoResponse> listar() {

        List<Curso> listaCurso = cursoRepository.findAll();
        List<CursoResponse> cursoResponse = new ArrayList<>();
        listaCurso.stream().forEach(curso ->
                cursoResponse.add(mapperCursoResponse.toResponse(curso)));
        return cursoResponse;
    }

    public CursoResponse obter(Long id) {
        Curso cursoObter = cursoRepository.findById(id).get();

        return mapperCursoResponse.toResponse(cursoObter);
    }
}
