package com.alura.forumchallenge.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacaoUsuario(
		@NotBlank
		String nome,
		@NotBlank
		String senha) {

}
