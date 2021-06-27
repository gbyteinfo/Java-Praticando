package com.br.arrayevetor;

import java.util.Scanner;

public class ArrayEvetor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = "\n";
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.printf("Numero do 1° array %d %s", num[2], line);

		int[] num2 = {40,50,60};
		System.out.printf("%sNumeros 2° array %d%s", line, num2[1], line);
		
		//PERCORRENDO O 1 ARRAY COM O FOR
		for(int i=0; i<3;i++) {
			System.out.printf("%s=> Numeros 1° array com for %d", line, num[i]);
		}
		
		System.out.println(line);
		
		//PERCORRENDO O 2 ARRAY COM FOR
		for(int i=0; i<3;i++) {
			System.out.printf("%s=> Numeros 2° array com for %d", line, num2[i]);
		}
	}
	
}

