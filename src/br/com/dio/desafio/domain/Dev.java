package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private Set<Conteudo> mentorias = new LinkedHashSet<>();
	
	private Set<Conteudo> cursos = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public void inscrincao() {
		
	}
	
	public void calculoTotalXP() {}
	
	public Conteudo exibirCursos() {return null;}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getMentorias() {
		return mentorias;
	}

	public void setMentorias(Set<Conteudo> mentorias) {
		this.mentorias = mentorias;
	}

	public Set<Conteudo> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Conteudo> cursos) {
		this.cursos = cursos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(id, other.id);
	}
	
}
