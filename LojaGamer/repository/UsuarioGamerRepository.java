package com.LojaGamer.LojaGamer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaGamer.LojaGamer.model.UsuarioGamer;



@Repository
public interface UsuarioGamerRepository extends JpaRepository<UsuarioGamer, Long> {
	
	public Optional<UsuarioGamer> findByUsuario(String usuario);

}
