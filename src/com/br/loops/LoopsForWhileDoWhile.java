package com.br.loops;

import java.util.Scanner;

public class LoopsForWhileDoWhile {
	
	public static void main(String[] args) {
		
		//*****INICIO DADOS PARA AS OPERAÇÕES********
		Scanner scan = new Scanner(System.in);
		 
		String line = "\n";
		
		System.out.printf("Digite seu Nome: %s", line);
		String nome = scan.nextLine();

		System.out.printf("Pressione o numero de Lopps e de enter: %s", line);
		int numDigitado = scan.nextInt();
		
		int contWhile = 0, cont2While = numDigitado, contDoWhile = 0, cont2DoWhile = numDigitado;
		//*****FIM DADOS PARA AS OPERAÇÕES********
		
		
		
		
		//OPERAÇÕES
		
		//FOR INICIALIZAÇÃO DO CONTADOR DENTRO DO ESCOPO DO FOR OU FORA
		//UTILIZAÇÃO RECOMENDADA QUANDO "SIM" SE SABE QUANTAS VEZES É NESCESSARIO EXECUTAR
		for(int contFor = 0; contFor <= numDigitado; contFor++ ) {// cont++ | cont = cont + 1 | cont+=1
			System.out.printf("%sLOOP FOR | %s => digitou %d | Contador crescente em => %d", line, nome, numDigitado, contFor);
		}
		
		for(int contFor = numDigitado; contFor >= 0; contFor-- ) {// cont-- | cont = cont - 1 | cont-=1
			System.out.printf("%sLOOP FOR | %s => digitou %d | Contador decrescente em => %d", line, nome, numDigitado, contFor);
		}
		System.out.print(line+line);
		
		//WHILE INICIALIZAÇÃO DO CONTADOR FORA DO ESCOPO DO WHILE
		//UTILIZAÇÃO RECOMENDADA QUANDO "NAO" SE SABE QUANTAS VEZES É NESCESSARIO EXECUTAR
		while(contWhile <= numDigitado ) {
			System.out.printf("%sLOOP WHILE | %s => digitou %d | Contador crescente em => %d", line, nome, numDigitado, contWhile);
			contWhile++;//
		}
		while(cont2While >= 0 ) {
			System.out.printf("%sLOOP WHILE | %s => digitou %d | Contador decrescente em => %d", line, nome, numDigitado, cont2While);
			cont2While--;//
		}
		System.out.print(line+line);
		
		//DO WHILE
		//
		do {
			System.out.printf("%sLOOP DO WHILE | %s => digitou %d | Contador crescente em => %d", line, nome, numDigitado, contDoWhile);
			contDoWhile++;
		}while(contDoWhile <= numDigitado );
		
		do {//FAÇA
			System.out.printf("%sLOOP DO WHILE | %s => digitou %d | Contador decrescente em => %d", line, nome, numDigitado, cont2DoWhile);
			cont2DoWhile--;
		}while(cont2DoWhile >= 0 );//ENQUANTO
		
		
		System.out.printf("%s%sFim da Aplicação",line,line);	
		
	}
	
}
