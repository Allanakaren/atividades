package com.LojaGamer.LojaGamer.securyty;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.LojaGamer.LojaGamer.model.UsuarioGamer;
import com.LojaGamer.LojaGamer.repository.UsuarioGamerRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioGamerRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<UsuarioGamer> usuariogamer = userRepository.findByUsuario(userName);
	  
		usuariogamer.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));


		return usuariogamer.map(UserDetailsImpl::new).get();
	}

}
