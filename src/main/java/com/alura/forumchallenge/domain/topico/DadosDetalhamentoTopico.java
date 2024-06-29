package com.alura.forumchallenge.domain.topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.alura.forumchallenge.domain.resposta.DadosDetalhamentoResposta;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime datacriacao,
        List<DadosDetalhamentoResposta> respostas
) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(),
                topico.getResposta().stream()
                        .map(DadosDetalhamentoResposta::new)
                        .collect(Collectors.toList()));
    }
}