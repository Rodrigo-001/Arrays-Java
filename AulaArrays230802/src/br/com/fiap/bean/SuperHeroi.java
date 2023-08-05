/*Programa feito para praticar concetos de arrays*/
/*Recebe nome do herói, fraquezas e poderes, assim como a quantidade de cada.  Guarda-os em um array e
 * imprime as informações na tela*/
package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome, idSecreta, poderes[], fraquezas[];
	
//construtores
	public SuperHeroi() {		
	}
	public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}
//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdSecreta() {
		return idSecreta;
	}
	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}
	public String[] getPoderes() {
		return poderes;
	}
	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}
	public String[] getFraquezas() {
		return fraquezas;
	}
	public void setFraquezas(String[] fraquezas) {
		this.fraquezas = fraquezas;
	}
	//métodos
	public void listaHeroi() {		
		String mostrar = "- Nome do herói: "+this.nome+"\n\n- ID Secreta: "+this.idSecreta
				+"\n\n- Poderes: ";		
		int contador = 1;
		//laço - percorre array poderes e guarda valores na variavel. 
		for (String poder : this.poderes) {
			 mostrar +=  "\n  "+contador+": "+poder;
			 contador++;
		}
		mostrar += "\n\n- Fraquezas: ";		
		contador = 1;			//reinicia contador
		//laço - percorre array fraquezas e guarda valores na variavel.
		for (String fraqueza : fraquezas) {
			mostrar += "\n  "+contador+": "+fraqueza;
			contador++;
		}
		JOptionPane.showMessageDialog(null, mostrar);		//Imprime conteúdo da variável 
	}
	
}
