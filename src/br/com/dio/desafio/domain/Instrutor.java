package br.com.dio.desafio.domain;

import java.util.HashSet;
import java.util.Set;

public class Instrutor extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private Set<Conteudo> conteudosMinistrados = new HashSet<>();
	
	public Instrutor() {
	}
	
	public Set<Conteudo> getConteudosMinistrados() {
		return conteudosMinistrados;
	}
	public void setConteudosMinistrados(Set<Conteudo> conteudosMinistrados) {
		this.conteudosMinistrados = conteudosMinistrados;
	}

	@Override
	public String toString() {
		return "Pessoa [id = " + getId() 
				+ ", nome = " + getNome() 
				+ ", tipoPessoa = " + getTipoPessoa() 
				+ ", cpfCnpj = " + getCpfCnpj()
				+ ", escolaridade = " + getEscolaridade() 
				+ ", Conteudos Ministrados = " + conteudosMinistrados + "]"
				+ "]";
	}
	
	

}
