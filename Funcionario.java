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

public class Funcionario {
	private String nome;
	private String cargo;
	
	public Funcionario(String nome, String cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
