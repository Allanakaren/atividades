package com.LojaGamer.LojaGamer.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_usuariosgamer")
public class UsuarioGamer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo Nome é Obrigatório!")
	private String nome;

	@NotNull(message = "O atributo Usuário é Obrigatório!")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	private String usuario;

	@NotBlank(message = "O atributo Senha é Obrigatório!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;

	private String foto;

	@OneToMany(mappedBy = "usuariogamer", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuariogamer")
	private List<ProdutoGamer> produtoGamer;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public List<ProdutoGamer> getProdutoGamer() {
		return produtoGamer;
	}


	public void setProdutoGamer(List<ProdutoGamer> produtoGamer) {
		this.produtoGamer = produtoGamer;
	}


	

	
	
}
