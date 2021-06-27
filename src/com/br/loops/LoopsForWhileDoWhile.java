package com.br.loops;

public class LoopsForWhileDoWhile {
	
	public static void main(String[] args) {
		
		
		String line = "\n";
		
		//OPERA��ES
		
		//FOR INICIALIZA��O DO CONTADOR DENTRO DO ESCOPO DO FOR OU FORA
		//UTILIZA��O RECOMENDADA QUANDO "SIM" SE SABE QUANTAS VEZES � NESCESSARIO EXECUTAR
		for(int contFor = 0; contFor <= 2; contFor++ ) {// cont++ | cont = cont + 1 | cont+=1
			System.out.printf("%sLOOP FOR | Jorge Mira contador crescente em => %d", line, contFor);
		}
		
		for(int contFor = 2; contFor >= 0; contFor-- ) {// cont-- | cont = cont - 1 | cont-=1
			System.out.printf("%sLOOP FOR | Jorge Mira contador decrescente em => %d", line, contFor);
		}
		System.out.print(line+line);
		
		
		
		//WHILE INICIALIZA��O DO CONTADOR FORA DO ESCOPO DO WHILE
		//UTILIZA��O RECOMENDADA QUANDO "NAO" SE SABE QUANTAS VEZES � NESCESSARIO EXECUTAR
		int contWhile = 0,cont2While = 3;
		
		while(contWhile <= 3 ) {
			System.out.printf("%sLOOP WHILE | Jorge Mira contador crescente em => %d", line, contWhile);
			contWhile++;//
		}
		while(cont2While >= 0 ) {
			System.out.printf("%sLOOP WHILE | Jorge Mira contador decrescente em => %d", line, cont2While);
			cont2While--;//
		}
		
		System.out.printf("%s%sFim da Aplica��o",line,line);
		
	}
	
}
