package com.alura.forumchallenge.domain.topico;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.validation.constraints.NotBlank;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByStatus(String status);

	Optional<Topico> getTopicById(Long id);

	@NotBlank
	String findByTitulo(@NotBlank String titulo);

	@NotBlank
	String findByMensagem(@NotBlank String mensagem);
	
}
