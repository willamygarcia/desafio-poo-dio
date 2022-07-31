package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.util.Objects;

public class Curso extends Conteudo implements Serializable{

	private static final long serialVersionUID = 1L;
	
		
	private Integer cargaHoraria;
	
	public Curso() {
	}
	
	public Curso(Integer id, String titulo, String descricao, Integer cargaHoraria) {
		setId(id);
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public Curso(Integer cargaHoraria) {
		super();
		this.cargaHoraria = cargaHoraria;
	}



	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double calcularXP(Double xp) {
		Double XP_atual = getXP() + xp;
		return XP_atual;
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
		Curso other = (Curso) obj;
		return Objects.equals(getId(), other.getId());
	}

	@Override
	public String toString() {
		return "Curso {ID = " + getId() + 
			   ", Titulo = " + getTitulo() + 
			   ", Descricao = " + getDescricao() + 
			   ", Data = " + getCargaHoraria() +
			   ", XP = " + getXP() + "}";
	}
	
	
	

	

	
	
}
