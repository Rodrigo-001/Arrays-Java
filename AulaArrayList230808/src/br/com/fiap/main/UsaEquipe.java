package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Equipe;

public class UsaEquipe {

	public static void main(String[] args) {
		Equipe grupo;
		String aux, nome, escolha ="sim";
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite nome da equipe: ");
				String membros = "Continua";
				ArrayList<String> integrantes = new ArrayList<String>();
				while (membros.equalsIgnoreCase("continua")) {
					aux = JOptionPane.showInputDialog("Digite integrante da equipe"
							+ "\nOu \"fim\" para encerrar. ");
					if (aux.equalsIgnoreCase("fim")) {
						membros = "fim";
					} else {
						integrantes.add(aux);						
					}
				}
				grupo = new Equipe(nome, integrantes);
				grupo.listaEquipe();
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim da Execução!");
	}

}
