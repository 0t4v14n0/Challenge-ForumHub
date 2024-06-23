package com.alura.forumchallenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forumchallenge.domain.usuario.DadosAutenticacaoUsuario;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {
	
	private AuthenticationManager manager;
	
    @PostMapping()
    public ResponseEntity logar(@RequestBody @Valid DadosAutenticacaoUsuario dados, UriComponentsBuilder uriBuilder) {
    	var token = new UsernamePasswordAuthenticationToken(dados.nome(), dados.senha());
    	var autentication = manager.authenticate(token);
    	return ResponseEntity.ok().build();
    	
    }

}
