package com.br.condicoes;

public class CondicoesSwitchCase {
public static void main(String[] args) {
		
		//DADOS PARA AS OPERAÇÕES
		int posicao = 6;
		
		
		//OPERAÇÕES
		switch(posicao) {
			case 1:
				System.out.println("Primeiro Lugar");
				break;
			case 2:
				System.out.println("Segundo Lugar");
				break;
			case 3:
				System.out.println("Terceiro Lugar");
				break;
			case 4: case 5: case 6:
				System.out.println("Obrigado por participar");
				//break;//SEM O BREAK ELE CONTINUA PARA A PROX INSTRUÇÃO
			default:
				System.out.println(" :( Ganhou nada ):");
				break;
		
		}
		
		
	}
}
