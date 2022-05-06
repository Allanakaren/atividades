package com.LojaGamer.LojaGamer.model;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_produtosGamer")
public class ProdutoGamer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min=3, max=255)
	private String nome;
	
	@NotBlank
	@Size(min=3, max=255)
	private String modelo;
	
	@NotBlank
	@Size(min=3, max=255)
	private String Marca;
	
	@NotBlank
	@Size(max=1000)
	private String descricao;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive(message = "Digite um valor maior do que zero")
    private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtoGamer")
	private CategoriaGamer categoriaGamer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public CategoriaGamer getCategoriaGamer() {
		return categoriaGamer;
	}

	public void setCategoriaGamer(CategoriaGamer categoriaGamer) {
		this.categoriaGamer = categoriaGamer;
	}

	
	
	
	
}
