package com.LojaGamer.LojaGamer.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoriaGamer")
public class CategoriaGamer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min=3, max=255)
	private String acao;
	
	@NotBlank
	@Size(min=3, max=255)
	private String aventura;
	
	@NotBlank
	@Size(min=3, max=255)
	private String terro;
	
	@NotBlank
	@Size(min=3, max=255)
	private String luta;
	
	@OneToMany(mappedBy="categoriaGamer" , cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoriaGamer")
	private List<ProdutoGamer> produtoGamer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getAventura() {
		return aventura;
	}

	public void setAventura(String aventura) {
		this.aventura = aventura;
	}

	public String getTerro() {
		return terro;
	}

	public void setTerro(String terro) {
		this.terro = terro;
	}

	public String getLuta() {
		return luta;
	}

	public void setLuta(String luta) {
		this.luta = luta;
	}

	public List<ProdutoGamer> getProdutoGamer() {
		return produtoGamer;
	}

	public void setProdutoGamer(List<ProdutoGamer> produtoGamer) {
		this.produtoGamer = produtoGamer;
	}

	
	
}
