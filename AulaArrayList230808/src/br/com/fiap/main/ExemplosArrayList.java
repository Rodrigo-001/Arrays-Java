package br.com.fiap.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemplosArrayList {

	public static void main(String[] args) {
		//cria arrayList e instancia com tipo String
		ArrayList<String> cars = new ArrayList<String>();
		
		//jogar valores dentro de arrayList
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Fiat");
		
		//acessar arrrayList
		System.out.println(cars);
		
		//acessar elemento especifico do arrayList
		System.out.println("\n"+cars.get(3));
		
		//Substituir valores do arrayList
		cars.set(0, "Bugatti");
		System.out.println(cars);
		
		//Remove elemento do índice
		cars.remove(1);
		System.out.println("\n"+cars);
		
		//Mostrar tamanho do arrayList
		System.out.println("\nTamanho: "+cars.size());
		
		//Limpar arrayList
		/*cars.clear();
		System.out.println("\nArrayList vazio: "+cars);	*/
		
		//Percorrer arrayList com laço
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//Ordenar arrayList (usar classe Colections)
		System.out.println("\nOrdenando em crescente: ");
		Collections.sort(cars);		
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
