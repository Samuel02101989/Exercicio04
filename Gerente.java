/**
 * 
 * @author Samuel Oliveira
 * @category Exerc03 Model
 * @since 16-03-2018 - data de criaçao da classe
 * @version 1.2
 * 
 * @see MUINGA-1234
 */

package com.indra.exercicio03.model;

public class Gerente {
	private String nomeGerente;
	private String AreaAtuacao;
	
	public Gerente(String nomeGerente, String areaAtuacao) {
		super();
		this.nomeGerente = nomeGerente;
		AreaAtuacao = areaAtuacao;
	}
	public String getNomeGerente() {
		return nomeGerente;
	}
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	public String getAreaAtuacao() {
		return AreaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		AreaAtuacao = areaAtuacao;
	}
	
}
