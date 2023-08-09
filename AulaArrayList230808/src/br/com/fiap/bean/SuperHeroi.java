package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome, idSecreta;
	private ArrayList<String> poderes, fraquezas;

	// construtores
	public SuperHeroi() {
	}

	public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}

	// gets e sets
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

	public ArrayList<String> getPoderes() {
		return poderes;
	}

	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}

	public ArrayList<String> getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(ArrayList<String> fraquezas) {
		this.fraquezas = fraquezas;
	}

	// métodos
	public void listaHeroi() {
		/*exibir nome, id secreta
		 * exibir poderes e fraquezas (ordem alfabética)*/
		String exibir = "Nome: "+this.nome+"\nId Secreta: "+this.idSecreta;
		Collections.sort(this.poderes);
		int cont=1;
		for (String poder: poderes) {
			exibir += " \n"+cont+"° Poder:"+poder;
			cont++;
		}
		cont=1;
		Collections.sort(this.fraquezas);
		for (String fraqueza : fraquezas) {
			exibir+= " \n"+cont+"° Fraqueza: "+fraqueza;
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibir);
	}

}
