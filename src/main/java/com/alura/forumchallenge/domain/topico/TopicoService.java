package com.alura.forumchallenge.domain.topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forumchallenge.domain.curso.CursoService;
import com.alura.forumchallenge.domain.usuario.Usuario;
import com.alura.forumchallenge.domain.usuario.UsuarioService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class TopicoService {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private TopicoRepository repository;

	@Transactional
	public Long cadastrar(@Valid DadosNovoTopico dados, String usuarioLogado) {
		
		Usuario usuario = usuarioService.findByLogin(usuarioLogado);
				
        var curso = cursoService.buscarCurso(dados.nomeCurso());
        
		Topico topico = new Topico();
        topico.setTitulo(dados.titulo());
        topico.setMensagem(dados.mensagem());
        topico.setAutor(usuario);
        topico.setCurso(curso);
        topico.setDataCriacao(LocalDateTime.now());
        topico.setStatus("Ativo");

        Topico cadastrarTopico = repository.save(topico);
        return cadastrarTopico.getId();
	}
	
	public List<DadosDetalhamentoTopico> listaTopicos() {
	    List<Topico> topicos = repository.findByStatus("Ativo");
	    return topicos.stream()
	                  .map(topico -> new DadosDetalhamentoTopico(topico))
	                  .collect(Collectors.toList());
	}

	public Object deletar(Long id) {
		var topico = repository.getReferenceById(id);
		topico.desativaTopico();
		return topico;
	}

}
