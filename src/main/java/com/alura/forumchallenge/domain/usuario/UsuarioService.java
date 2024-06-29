package com.alura.forumchallenge.domain.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
    private UsuarioRepository repository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
    
    public Usuario findByLogin(String login) {
    	try {
    		
            Usuario usuario = (Usuario) (repository.findByEmail(login));
            
            if (usuario == null) {
                throw new IllegalArgumentException("Usuário não encontrado com login: " + login);
            }
            
            return usuario;
            
    	}catch(Exception e){
    		System.out.println("deu ruim");
    	}
		return null;
    }
    
    public String senhaCrypt(String senha) {
    	String senhaCriptografada = passwordEncoder.encode(senha);
		return senhaCriptografada;
    }

}
