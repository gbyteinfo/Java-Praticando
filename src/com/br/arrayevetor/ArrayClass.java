package com.br.arrayevetor;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numDigitado = 3;
		
		String line = "\n";
		int[] numeros = {10,20,30,40};
		int[] numeros2 = {1,9,5,26};
		int[] numeros3 = new int[numDigitado];
		int posicao;
		
		for(int i=0; i < 4; i++) {
			System.out.printf("For percorrento | posição %d => %d%s", i, numeros[i], line);
		}
		
		for(int n:numeros) {
			System.out.printf("%sFor resumido | => %d", line, n);
		}
		
		//METODO SORT
		Arrays.sort(numeros2);
		for(int n:numeros2) {
			System.out.printf("%sOrdenados com metodo Sort %d ", line, n);
		}
		
		//MEDOTO FILL
		System.out.printf("Digite um numero: %s", line);
		numDigitado = scan.nextInt();
		
		Arrays.fill(numeros3, numDigitado);
		for(int n:numeros3) {
			System.out.printf("%sNumero digitado %d repete 3x", line, n);
		}
	}
	
}
