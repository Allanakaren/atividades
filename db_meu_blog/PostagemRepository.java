package com.blogpessoal.blogpessoal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.postagem;

@Repository
public interface PostagemRepository extends JpaRepository<postagem, Long> {

}