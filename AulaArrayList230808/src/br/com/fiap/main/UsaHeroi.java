package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.bean.SuperHeroi;

public class UsaHeroi {

	public static void main(String[] args) {
		/* declarar e instanciar classe SuperHeroi
		 * declarar arraysLists
		 * RECEBER: nome, idSecreta
		 * laço para rodar programa principal  -----------------
		 * 		laço para receber poderes (usar "fim" para encerrar)
		 *  	laço para receber fraquezas (usar "fim" para encerrar)
		 *  	instanciar ArraysLists
		 * 		jogar valores via construtor
		 *  	exibir usando método listaHeroi
		 *  	(perguntar se deseja continuar repetir os passos, senão encerre
		 *  	com mensagem de despedida)
		 * */
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
			heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
			heroi.listaHeroi();			
			continuar = JOptionPane.showInputDialog("Sim - para continuar"
					+ "\nNão - para encerrar");
		}
		JOptionPane.showMessageDialog(null, "Fim da execução!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
