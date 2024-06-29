package com.alura.forumchallenge.domain.topico;

import java.time.LocalDateTime;
import java.util.List;

import com.alura.forumchallenge.domain.resposta.Resposta;

public record DadosDetalhamentoTopico(
		Long id,
		String titulo,
		String mensagem,
		LocalDateTime datacriacao,
		List<Resposta> respostas
		) {

	public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(),topico.getTitulo(),topico.getMensagem(),topico.getDataCriacao(),topico.getResposta());
	}

}
