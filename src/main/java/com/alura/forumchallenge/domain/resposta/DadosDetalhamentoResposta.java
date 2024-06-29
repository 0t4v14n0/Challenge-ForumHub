package com.alura.forumchallenge.domain.resposta;

public record DadosDetalhamentoResposta(
        Long id,
        String mensagem
        
) {

    public DadosDetalhamentoResposta(Resposta resposta) {
        this(
            resposta.getId(),
            resposta.getMensagem()
        );
    }
}