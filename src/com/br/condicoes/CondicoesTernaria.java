package com.br.condicoes;

public class CondicoesTernaria {

	public static void main(String[] args) {
		
		//DADOS PARA AS OPERA합ES
		int nota = 39;
		int faltas = 4;
		int maxFaltas = 5;
		int media = 70;
		int resultadoInt;
		String resultado;
		
		//OPERA합ES
		
		//CONDI플O IF ELSE - SEM BREAK
		if((nota >= media) && (faltas <= maxFaltas)) {
			System.out.println("if-else => Aprovado");
		}else if(nota >= 40){
			System.out.println("if-else => Recuperacao");
		}else {
			System.out.println("if-else => Reprovado");
		}
		System.out.println("if-else => Fim do programa");
		
		//CONDI플O TERNARIA - PADR홒
		resultado = (nota >= media ? "ternaria => Aprovado" : "ternaria => Reprovado");
		System.out.println("\n" + resultado);
		
		//CONDI플O TERNARIA - INCORPORANDO EM PARAMETROS
		resultadoInt = (nota >= media ? 1 : 0);
		System.out.println("\n"+(resultadoInt == 1 ? "ternaria2 => Aprovado" : "ternaria2 => Reprovado"));		
		
		
	}
}
