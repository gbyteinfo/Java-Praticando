package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		
		aulas.remove(0);
		System.out.println(aulas);
		
		
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		
		
		String primeiraAula = aulas.get(0);
		System.out.println("\n A primeira aula é: " + primeiraAula);
		
		
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("\n Aula: " + aulas.get(i));
		}
		System.out.println(aulas.size());
		aulas.forEach(aula -> {
								System.out.println("\n Percorrendo: ");
								System.out.println("Aula" + aula);
							});
		
		
		
		aulas.add("Aumentando nosso conhgecimento");
		System.out.println(aulas);
		aulas.add("Ordenado com Collections.sort");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		
		
		
		
		
		
	}
	
}
