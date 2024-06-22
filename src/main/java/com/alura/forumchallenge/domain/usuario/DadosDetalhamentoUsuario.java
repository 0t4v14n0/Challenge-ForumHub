package com.alura.forumchallenge.domain.usuario;

public record DadosDetalhamentoUsuario(Long id,String nome,String email, String Senha) {
	
	public DadosDetalhamentoUsuario(Usuario usuario) {
		this(usuario.getId(),usuario.getNome(),usuario.getEmail(),usuario.getSenha());
	}

}
