package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Mentoria extends Conteudo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private LocalDate data;
	
	public Mentoria() {
	}

	public Mentoria(Integer id, String titulo, String descricao, LocalDate data) {
		super();
		setId(id);
		setTitulo(titulo);
		setDescricao(descricao);
		this.data = data;
	}
	
	public Double calcularXP() {
		return getXP();
	}

	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria {id=" + getId() + 
			   ", titulo=" + getTitulo() + 
			   ", descricao=" + getDescricao() + 
			   ", data=" + data + "}";
	}
	
	
}
