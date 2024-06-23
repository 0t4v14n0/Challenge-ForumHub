package com.alura.forumchallenge.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.persistence.EntityNotFoundException;

public class TratadorDeErros {
	
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> tratarErro404(EntityNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entity not found");
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();

        return ResponseEntity.badRequest().body(erros.stream().map(DadosErroValidacoo::new).toList());

    }
    
    private record DadosErroValidacoo(String campo, String mensagem) {
    	
    	public DadosErroValidacoo(FieldError erro) {
    		this(erro.getField(), erro.getDefaultMessage());
    	}
    	
    }

}
