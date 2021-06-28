package com.br.arrayevetor;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanho = 4, numDigitado;
		
		String line = "\n";
		int[] numeros = {1,998,60,3};
		int[] numeros2 = {1,9,5,26};
		int[] numeros3 = new int[tamanho];
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
		System.out.printf("%sDigite um numero: %s", line, line);
		numDigitado = scan.nextInt();
		Arrays.fill(numeros3, numDigitado);
		for(int n:numeros3) {
			System.out.printf("%sNumero digitado %d repete 3x", line, n);
		}
		System.out.print(line);
		
		//COPIANDO UM ARRAY PARA OUTRO
		System.arraycopy(numeros2, 0, numeros3, 0, tamanho);
		for(int n:numeros3) {
			System.out.printf("%sNumeros copiados %d ", line, n);
		}
		
		//COMPARAÇÃO DE ARRAYS IGUAIS OU NÃO
		System.out.printf("%s%sArrays 2 e 3 são iguais? %s%s ",line, line, line, Arrays.equals(numeros2, numeros3) ? "SIM, SÃO IGUAI":"NÃO, NÃO SÃO IGUAIS");
		
		//VERIFICANDO ELEMENTOS
		System.out.printf("%sDigite outro numero: %s",line, line);
		int posicaoVerif=0, numeroEscolhido=0;
		numeroEscolhido = scan.nextInt();
		Arrays.sort(numeros);
		posicaoVerif = Arrays.binarySearch(numeros, numeroEscolhido);
		System.out.printf("%s%sO elemento %d esta no array? %s%s ",line, line, numeroEscolhido, line, posicaoVerif > 0 ? "SIM":"NÃO");
		
		
	}
	
}
