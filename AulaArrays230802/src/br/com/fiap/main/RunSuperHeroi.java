/*Programa feito para praticar concetos de arrays*/
/*Recebe nome do herói, fraquezas e poderes, assim como a quantidade de cada.  Guarda-os em um array e
 * imprime as informações na tela*/
package br.com.fiap.main;

import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.fiap.bean.SuperHeroi;

public class RunSuperHeroi {

	public static void main(String[] args) {	
		//declaração de variaveis e arrays;
		String nome, idSecreta, aux, continuar = "sim";		
		String[] poderes, fraquezas;			
		int qtd;		
		try {			
			//loop - Executa enquanto usuário responder sim
			while (continuar.equalsIgnoreCase("sim")) {
				nome = JOptionPane.showInputDialog("Nome do herói: ");
				idSecreta = JOptionPane.showInputDialog("Identidade secreta: ");
				aux = JOptionPane.showInputDialog("Quantidade de fraquezas: ");
				qtd = Integer.parseInt(aux);
				fraquezas = new String[qtd];			
				aux = JOptionPane.showInputDialog("Quantidade de poderes: ");
				qtd = Integer.parseInt(aux);
				poderes = new String[qtd];
				//envia fraquezas para o array
				int cont=1;
				for (int f = 0; f < fraquezas.length; f++) {
					fraquezas[f] = JOptionPane.showInputDialog("Fraqueza "+cont+": ");
					cont++;				
				}
				//envia poderes para o array
				cont=1;
				for (int p = 0; p < poderes.length; p++) {
					poderes[p] = JOptionPane.showInputDialog("Poder "+cont+": ");
					cont++;
				}
				//passa os valores via construtor e imprime usando método da classe SuperHeroi.
				SuperHeroi heroi1 = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
				heroi1.listaHeroi();
				continuar = JOptionPane.showInputDialog("Continuar? ");			
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());			
		}
		JOptionPane.showMessageDialog(null, "Fim! Volte sempre");
		

	}

}
