package com.br.arrayevetor;
import java.security.SecureRandom;
import java.util.Arrays;

public class ArrayMatrizes {
	public static void main(String[] args) {
		
		String line = "\n";
		final int linhas = 3;
		final int colunas = 5;
		int[][] numeros = new int[linhas][colunas];
		
		for(int l=0 ; l<linhas ; l++) {
			for(int c=0 ; c<colunas; c++) {
				numeros[l][c] = new SecureRandom().nextInt(100);// PASSANDO O NUMERO MAX PARA ESCOLHA
			}
		}
		
		for(int l=0 ; l<linhas ; l++) {
			for(int c=0 ; c<colunas; c++) {
				System.out.printf("%2d|", numeros[l][c]);
			}
			System.out.printf("%n");
		}
		System.out.printf(line);
		//COMPARAÇÃO DE ARRAYS IGUAIS OU NÃO
		for(int[] n:numeros) {
			for(int v:n) {
				System.out.printf("%2d|", v);
			}
			System.out.printf("%n");
		}
	}
}
