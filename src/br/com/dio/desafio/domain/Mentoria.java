package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

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
	
	public Double calcularXP(Double xp) {
		Double XP_atual = getXP() + xp;
		return XP_atual;
	}

	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentoria other = (Mentoria) obj;
		return Objects.equals(getId(), other.getId());
	}

	@Override
	public String toString() {
		return "Mentoria {id=" + getId() + 
			   ", titulo=" + getTitulo() + 
			   ", descricao=" + getDescricao() + 
			   ", data=" + data + "}";
	}
	
	
}
