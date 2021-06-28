package com.br.arrayevetor;

import java.util.Scanner;

public class Gabarito {
	
	public static void main(String[] args) {
		String line = "\n", nome;
		
		Scanner scan = new Scanner(System.in);
		final int tamanho = 5;
		int acertos=0, erros=0;
		
		
		char[] gabarito = {'b','c','c','a','b'};
		char[] respostas = new char[tamanho];
		
		respostas[0]='b';
		respostas[1]='c';
		respostas[2]='d';
		respostas[3]='c';
		respostas[4]='c';
		
		System.out.printf("Digite seu Nome: %s%s", line,line);
		nome = scan.nextLine();
		
		for(int i=0; i<tamanho;i++) {
			System.out.printf("%s Digite a resposta %d entre: a b c d %s", nome, i, line);
			respostas[i] = scan.nextLine().charAt(0);//convertendo para char
		}
		
		for(int i=0; i<tamanho;i++) {
			if(respostas[i] == gabarito[i]) {
				acertos++;
			}
		}
		
		System.out.printf("%s%s você acertou %d questoes! ",line, nome, acertos);
		
		
		
	}
	
}
