package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Equipe {
	private String nome;
	private ArrayList<String> integrantes;

	// construtores
	public Equipe() {
	}

	public Equipe(String nome, ArrayList<String> integrantes) {
		this.nome = nome;
		this.integrantes = integrantes;
	}

	// gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}

	// métodos
	public void listaEquipe() {
		int cont = 1;
		String exibe = "Nome: " + this.nome + "\n";
		Collections.sort(this.integrantes);
		for (String i : integrantes) {
			exibe += "Integrante " + cont + ": " + i + "\n";
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe);
	}

}
