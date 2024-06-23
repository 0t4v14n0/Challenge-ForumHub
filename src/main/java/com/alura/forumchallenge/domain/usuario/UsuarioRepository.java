package com.alura.forumchallenge.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

//@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	UserDetails findByEmail(String Email);

}
