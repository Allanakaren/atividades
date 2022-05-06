package com.LojaGamer.LojaGamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaGamer.LojaGamer.model.CategoriaGamer;



@Repository
public interface CategoriaGamerRepository extends JpaRepository<CategoriaGamer, Long>{
	
	public List <CategoriaGamer> findAllByAcaoContainingIgnoreCase(String acao); 

	
}
