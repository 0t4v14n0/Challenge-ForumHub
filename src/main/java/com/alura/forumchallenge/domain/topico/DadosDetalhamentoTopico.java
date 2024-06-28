package com.alura.forumchallenge.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
		Long id,
		String titulo,
		String mensagem,
		LocalDateTime datacriacao
		) {

	public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(),topico.getTitulo(),topico.getMensagem(),topico.getDataCriacao());
	}
}
