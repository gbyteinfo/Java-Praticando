package com.br.condicoes;

public class CondicoesTernaria {

	public static void main(String[] args) {
		
		int nota = 100;
		int faltas = 10;
		int maxFaltas = 5;
		int media = 70;
		
		if((nota >= media) && (faltas <= maxFaltas)) {
			System.out.println("=> Aprovado");
		}else if(nota >= 40){
			System.out.println("=> Recuperacao");
		}else {
			System.out.println("=> Reprovado");
		}
		System.out.println("\n Fim do programa");
	}
}
