package br.com.dio.desafio.domain;

import java.io.Serializable;
import java.util.Objects;

import br.com.dio.desafio.enumeration.Escolaridade;
import br.com.dio.desafio.enumeration.TipoPessoa;

public abstract class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private TipoPessoa tipoPessoa;
	
	private String cpfCnpj;
	
	private Escolaridade escolaridade;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, Escolaridade escolaridade) {
		super();
		this.id = id;
		this.nome = nome;
		this.escolaridade = escolaridade;
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
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
