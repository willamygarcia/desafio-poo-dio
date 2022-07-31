package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import br.com.dio.desafio.enumeration.Escolaridade;
import br.com.dio.desafio.enumeration.TipoPessoa;

public class Dev extends Pessoa{

	private static final long serialVersionUID = 1L;

	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(Integer id, String nome, TipoPessoa tipoPessoa, String cpfCnpj, Escolaridade escolaridade) {
		this.setId(id);
		this.setNome(nome);
		this.setTipoPessoa(tipoPessoa);
		this.setCpfCnpj(cpfCnpj);
		this.setEscolaridade(escolaridade);
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
		return Objects.hash(this.getId());
	}
	
}
