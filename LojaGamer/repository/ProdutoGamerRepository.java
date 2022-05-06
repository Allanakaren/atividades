package com.LojaGamer.LojaGamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.LojaGamer.LojaGamer.model.ProdutoGamer;


@Repository
public interface ProdutoGamerRepository extends JpaRepository<ProdutoGamer, Long>{

	public List <ProdutoGamer> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	

}
