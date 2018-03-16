package com.indra.exercicio03.controller;
/**
 * 
 * @author Samuel Oliveira
 * @category Exerc03 controller
 * @since 16-03-2018 - data de criaçao da classe
 * @version 1.2
 * 
 * @see MUINGA-1234
 */

import com.indra.exercicio03.model.Departamento;
import com.indra.exercicio03.model.Funcionario;
import com.indra.exercicio03.model.Gerente;
import com.indra.exercicio03.view.ViewExer03;

public class controllerEx03 {

	public static void main(String[] args) {
		
		try {
			
			Departamento dep = new Departamento();
			
			Gerente ger = new Gerente("Joao", "Engenharia");
			dep.setGerente(ger);
			dep.setTypeDepart("Tecnologia");
			dep.addFuncionarios(new Funcionario("Samuel", "Trainne"));
			dep.addFuncionarios(new Funcionario("Pedro", "Teste"));
			dep.addFuncionarios(new Funcionario("Joao", "Developer"));
			dep.addFuncionarios(new Funcionario("Eric", "Data Science"));
			dep.addFuncionarios(new Funcionario("Antonio", "Engenherio"));
			
			

			ViewExer03 view = new ViewExer03();
			view.printCustomerConsole(dep);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
