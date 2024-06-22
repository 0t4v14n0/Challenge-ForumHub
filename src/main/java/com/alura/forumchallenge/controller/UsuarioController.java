package com.alura.forumchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forumchallenge.domain.usuario.DadosCadastroUsuario;
import com.alura.forumchallenge.domain.usuario.DadosDetalhamentoUsuario;
import com.alura.forumchallenge.domain.usuario.Usuario;
import com.alura.forumchallenge.domain.usuario.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroUsuario dados, UriComponentsBuilder uriBuilder ) {	
    	var usuario = new Usuario(dados);
    	
    	repository.save(usuario);
    	
    	 var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(usuario.getId()).toUri();
    	
    	return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
    	
    }
    
    @GetMapping 
    public String retorna() {
    	return "ola";
    }

}
