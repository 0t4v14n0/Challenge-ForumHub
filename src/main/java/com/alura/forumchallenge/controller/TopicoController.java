package com.alura.forumchallenge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.transaction.annotation.Transactional;

import com.alura.forumchallenge.domain.topico.DadosDetalhamentoTopico;
import com.alura.forumchallenge.domain.topico.DadosNovoTopico;
import com.alura.forumchallenge.domain.topico.TopicoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topico")
public class TopicoController {
	
    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity novoTopico(@RequestBody @Valid DadosNovoTopico dados,
    								UriComponentsBuilder uriBuilder, 
    								Authentication authentication) throws Exception {
    	
        String usuarioLogado = authentication.getName();
        
        Long topicoId = topicoService.cadastrar(dados, usuarioLogado);
        
        return ResponseEntity.ok(topicoId);
    }
    
    @GetMapping
    public ResponseEntity<List<DadosDetalhamentoTopico>> listaTopico() {
        List<DadosDetalhamentoTopico> detalhes = topicoService.listaTopicos();
        
        if (detalhes.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(detalhes);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity listaTopicoId(@PathVariable Long id) {
    	    	
    	return ResponseEntity.ok(null);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity DesativarOuResolvido(@PathVariable Long id) {
    	topicoService.deletar(id);
    	return ResponseEntity.ok(200);
    }

}
