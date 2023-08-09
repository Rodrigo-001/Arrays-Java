/*Programa para praticar conceitos de ArrayList e laço de repetição*/
/*O programa pede nome, id secreta, poderes e fraquezas de um super herói e imprime as informações na tela*/
package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.bean.SuperHeroi;

public class UsaHeroi {

	public static void main(String[] args) {		
		//variáveis
		String nome, idSecreta, aux, continuar="sim",encerrar="nao";
		SuperHeroi heroi = new SuperHeroi();
		ArrayList<String> poderes= new ArrayList<String>();
		ArrayList<String> fraquezas= new ArrayList<String>();
		try {			
		//principal				
		while (continuar.equalsIgnoreCase("sim")) {
			//pergunta nome e id secreta
			nome = JOptionPane.showInputDialog("Nome do herói: ");
			idSecreta = JOptionPane.showInputDialog("\nId Secreta: ");
			//laço para poderes
			int cont=1;			
			while (encerrar.equalsIgnoreCase("nao")) {				
				aux = JOptionPane.showInputDialog("\nDigite "+cont+"° Poder ou \"Sim\" para encerrar. ");
				cont++;
				if (aux.equalsIgnoreCase("sim")) {
					encerrar = "sim";
				} else {
					poderes.add(aux);
				}			
			}
			//reinicia variáveis encerrar e contador
			encerrar="nao";
			cont=1;
			//laço fraquezas			
			while (encerrar.equalsIgnoreCase("nao")) {				
				aux = JOptionPane.showInputDialog("\nDigite "+cont+"° Fraqueza ou \"Sim\" para encerrar. ");
				cont++;
				if (aux.equalsIgnoreCase("sim")) {
					encerrar = "sim";
				} else {
					fraquezas.add(aux);
				}			
			}
			
			//passa valores obtidos para a classe heroi e usa método para imprimi-las.
			heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
			heroi.listaHeroi();	
			
			//limpa os arraylists e reinicia variavei auxiliar "encerrar".
			poderes.clear();
			fraquezas.clear();
			encerrar = "nao";
			
			//encerra ou ou retoma o laço principal
			continuar = JOptionPane.showInputDialog("Sim - para continuar"
					+ "\nNão - para encerrar");
		}
		JOptionPane.showMessageDialog(null, "Fim da execução!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
