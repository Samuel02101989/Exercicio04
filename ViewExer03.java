package com.indra.exercicio03.view;
import com.indra.exercicio03.model.Departamento;
import com.indra.exercicio03.model.Funcionario;

public class ViewExer03 {

	public void printCustomerConsole(Departamento dep) {
		try {
			if (dep == null)
				throw new Exception("Nao foi possivel imprimir informaçoes do Customer!!");

			
			System.out.println("===============================================================");
			System.out.println("_____________________Departamento__________________________");
			System.out.println("Tipo de Departamento: ".concat(dep.getTypeDepart()));
			System.out.println("_____________________Gerente__________________________");
			System.out.println("Nome do Gerente: ".concat(dep.getGerente().getNomeGerente()));
			System.out.println("Area de atuaçaos: ".concat(dep.getGerente().getAreaAtuacao()));
			System.out.println("===============================================================");

			for (Funcionario f : dep.getFunc()) {
				
				
				
				System.out.println("===============================================================");
				System.out.println("_____________________Phone-Customer____________________________");
				System.out.println("Tipo Fone: ".concat(f.getNome()));
				System.out.println("Codigo de area: ".concat(f.getCargo()));
				
				

			}
	
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
