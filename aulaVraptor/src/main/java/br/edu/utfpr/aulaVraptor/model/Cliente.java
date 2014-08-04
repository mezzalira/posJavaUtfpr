package br.edu.utfpr.aulaVraptor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;

	@NotNull
	@Column(nullable=false, length=100)
	private String nome;
	
	public Cliente(Long codigo) {
		this.codigo = codigo;
	}
	
	public Cliente() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
