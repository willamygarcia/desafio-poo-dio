package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public void inscrincao(Bootcamp bootcamp) {
		this.getConteudosInscritos().addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}
	public void  progredir() {
		
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está inscrito em nenhum Conteúdo");
		}
	}
	
	public Double calculoTotalXP() {
		return this.conteudosConcluidos.stream()
				.mapToDouble(Conteudo::calcularXP)
				.sum();
	}
	
	public Set<Conteudo> exibirCursos() {
		
		return this.getConteudosInscritos();
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

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
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
