package com.indra.exercicio03.model;
/**
 * 
 * @author Samuel Oliveira
 * @category Exerc03 Model
 * @since 16-03-2018 - data de criaçao da classe
 * @version 1.2
 * 
 * @see MUINGA-1234
 */
import java.util.ArrayList;

public class Departamento {
	private String typeDepart;
	private Gerente gerente;
	private ArrayList<Funcionario> func = new ArrayList<Funcionario>();
	
	public Departamento(String typeDepart, Gerente gerente, ArrayList<Funcionario> func) {
		super();
		this.typeDepart = typeDepart;
		this.gerente = gerente;
		this.func = func;
	}
	public Departamento() {
		
	}
	
	public ArrayList<Funcionario> getFunc() {
		return func;
	}
	public void setFunc(ArrayList<Funcionario> func) {
		this.func = func;
	}

	
	public String getTypeDepart() {
		return typeDepart;
	}
	public void setTypeDepart(String typeDepart) {
		this.typeDepart = typeDepart;
	}
	
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public Boolean addFuncionarios(Funcionario func) {
		try {
			if(func != null) {
				return this.func.add(func);
			}else {
				throw new Exception("Nao foi possivel adicionar o telefone");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Boolean.FALSE;
		}
		
	}
	
	
}
