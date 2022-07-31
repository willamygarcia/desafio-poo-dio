package br.com.dio.desafio.domain;

import java.io.Serializable;

public abstract class Conteudo implements Serializable{

	private static final long serialVersionUID = 1L;
		
	private Integer id;
	
	private final Double XP = 10D;
	
	private String titulo;
	
	private String descricao;
	
	public abstract Double calcularXP(Double xp);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getXP() {
		return XP;
	}
	
	
	

}
