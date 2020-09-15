package com.generation.redeSocial.seguranca;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.redeSocial.model.Usuario;
import com.generation.redeSocial.repository.UsuarioRepository;

@Service
public class UserDetailsServicelmpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetailslmpl loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> user = usuarioRepository.findByEmail(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));
		
		return user.map(UserDetailslmpl:: new).get();
	}

}
