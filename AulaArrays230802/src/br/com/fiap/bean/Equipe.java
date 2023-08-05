/*Programa feito para praticar concetos de arrays*/
/*Recebe nome da equipe, quantidade e integrantes, guarda os nomes
 * em um array e lista as informações na tela*///exibir nome
package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Equipe {
	private String nome;
	private String[] integrantes; // cria array

	// construtores
	public Equipe() {
	}
	public Equipe(String nome, String[] integrantes) {
		this.nome = nome;
		this.integrantes = integrantes;
	}	
	//gets e sets
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String[] getIntegrantes() {
		return integrantes;
	}	
	public void setIntegrantes(String[] integrantes) {
		this.integrantes = integrantes;
	}
	
	//métodos
	public void listaEquipe() {
		String exibe = "Nome da equipe: "+this.nome+"\n";
		int cont = 1;
		for(String i : this.integrantes) {
			exibe += "Integrante "+cont+": "+i+" \n";
			cont++;		
		}
		
		JOptionPane.showMessageDialog(null, exibe);
	}
}
