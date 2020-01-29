package br.com.generation.VitrineVirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tblproduto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="detalhes", length=500)
	private String detalhe;
	
	@Column(name="preco", length=200 )
	private float preco;
	
	@Column(name="linkfoto", length=200)
	private String linkfoto;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Departamento departamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getLinkfoto() {
		return linkfoto;
	}
	public void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}
	
	
}
