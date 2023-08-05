/*Programa feito para praticar concetos de arrays*/
/*Recebe nome da equipe, quantidade e integrantes, guarda os nomes
 * em um array e lista as informações na tela*/

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Equipe;

public class ExecutaEquipe {

	public static void main(String[] args) {
		Equipe grupo = new Equipe();
		String aux, nome, escolha = "sim";
		String[] integrantes;	//declara array
		int qtde;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("\nNome da equipe: ");
				aux = JOptionPane.showInputDialog("\nQuantidade de integrantes: ");
				qtde = Integer.parseInt(aux);
				integrantes = new String[qtde];// instancia e inicializa array				
				for (int i = 0; i < integrantes.length; i++) {		//"i" inicia com valor zero, percorre array integrantes e soma +1 a si mesmo no final.
					integrantes[i] = JOptionPane.showInputDialog("\nIntegrante "+(i+1));	//Usa "i" para exibir um contador e pede o nome do integrante					
				}					
				grupo = new Equipe(nome, integrantes);		//passa os valores para o construtor da classe
				grupo.listaEquipe();		//chama método da classe
				escolha = JOptionPane.showInputDialog("Deseja continuar ");		//Encerra ou retoma o laço
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}

		}
		JOptionPane.showMessageDialog(null, "Fim de programa!");
	}

}


