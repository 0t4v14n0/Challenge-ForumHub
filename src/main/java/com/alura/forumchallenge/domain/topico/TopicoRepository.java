package com.alura.forumchallenge.domain.topico;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	List<Topico> findByStatus(String status);
	

}
