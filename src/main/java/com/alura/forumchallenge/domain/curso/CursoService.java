package com.alura.forumchallenge.domain.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository repository;

    public Curso buscarCurso(String nomeCurso){
    	var segura = repository.BuscaCurso(nomeCurso);
    	System.out.println(segura);
        return segura;
    }

}
