package com.LojaGamer.LojaGamer.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.LojaGamer.LojaGamer.model.UsuarioGamer;
import com.LojaGamer.LojaGamer.model.UsuarioLoginGamer;
import com.LojaGamer.LojaGamer.repository.UsuarioGamerRepository;

@Service
public class UsuarioGamerService {
	
	@Autowired
	private UsuarioGamerRepository usuariogamerRepository;
	

	public Optional<UsuarioGamer> cadastrarUsuario(UsuarioGamer usuariogamer) {

		if (usuariogamerRepository.findByUsuario(usuariogamer.getUsuario()).isPresent())
			return Optional.empty();
	
		usuariogamer.setSenha(criptografarSenha(usuariogamer.getSenha()));

		return Optional.of(usuariogamerRepository.save(usuariogamer));
	
	}


	public Optional<UsuarioGamer> atualizarUsuario(UsuarioGamer usuariogamer) {
		
		if(usuariogamerRepository.findById(usuariogamer.getId()).isPresent()) {
			
		
			Optional<UsuarioGamer> buscaUsuario = usuariogamerRepository.findByUsuario(usuariogamer.getUsuario());
		
			if ( (buscaUsuario.isPresent()) && ( buscaUsuario.get().getId() != usuariogamer.getId()))
				throw new ResponseStatusException(
						HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

			usuariogamer.setSenha(criptografarSenha(usuariogamer.getSenha()));

	
			return Optional.ofNullable(usuariogamerRepository.save(usuariogamer));
			
		}
		
	
		return Optional.empty();
	
	}	

	public Optional<UsuarioLoginGamer> autenticarUsuario(Optional<UsuarioLoginGamer> usuarioLogingamer) {


		Optional<UsuarioGamer> usuario = usuariogamerRepository.findByUsuario(usuarioLogingamer.get().getUsuario());

		if (usuario.isPresent()) {

		
			if (compararSenhas(usuarioLogingamer.get().getSenha(), usuario.get().getSenha())) {

	
				usuarioLogingamer.get().setId(usuario.get().getId());
				usuarioLogingamer.get().setNome(usuario.get().getNome());
				usuarioLogingamer.get().setFoto(usuario.get().getFoto());
				usuarioLogingamer.get().setToken(gerarBasicToken(usuarioLogingamer.get().getUsuario(), usuarioLogingamer.get().getSenha()));
				usuarioLogingamer.get().setSenha(usuario.get().getSenha());

			
				return usuarioLogingamer;

			}
		}	
		
		return Optional.empty();
		
	}

	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(senha);

	}
	

	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.matches(senhaDigitada, senhaBanco);

	}

	private String gerarBasicToken(String usuario, String senha) {

		String token = usuario + ":" + senha;
		byte[] tokenBase64 = Base64.encodeBase64(token.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(tokenBase64);

	}

}
