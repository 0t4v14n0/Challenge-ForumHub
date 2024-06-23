package com.alura.forumchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forumchallenge.domain.usuario.DadosAutenticacaoUsuario;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    private static final Logger logger = LoggerFactory.getLogger(AutenticacaoController.class);

    @PostMapping
    public ResponseEntity<?> logar(@RequestBody @Valid DadosAutenticacaoUsuario dados, UriComponentsBuilder uriBuilder) {
        var token = new UsernamePasswordAuthenticationToken(dados.email(), dados.senha());
        try {
            var authentication = manager.authenticate(token);
            logger.info("Autenticação bem-sucedida para o usuário: " + dados.email());
            return ResponseEntity.ok().build();
        } catch (AuthenticationException e) {
            logger.error("Falha na autenticação para o usuário: " + dados.email(), e);
            return ResponseEntity.status(403).body("Falha na autenticação");
        }
    }
}