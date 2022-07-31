package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private final LocalDate dataInicial = LocalDate.now();
	
	private final LocalDate datafinal = dataInicial.plusDays(45);
	
	private Set<Dev> devs = new HashSet<>();
	
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public Bootcamp() {
	}

	public Bootcamp(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
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
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Bootcamp {\n"
				+ "id = " + id 
				+ ", nome = " + nome + "\n" 
				+ ", descricao = " + descricao + "\n"
				+ ", dataInicial = " + dataInicial+ "\n"
				+ ", datafinal = " + datafinal + "\n"
				+ ", devs Matriculados = " + devs + "\n"
				+ ", conteudos = " + conteudos + "\n" 
				+ "}";
	}
	
	
	

}
