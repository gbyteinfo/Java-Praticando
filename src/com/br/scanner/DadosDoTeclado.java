package com.br.scanner;
import java.util.Scanner;

public class DadosDoTeclado {
	
	public static void main(String[] args) {
		
		// scan QUE LE INFORMA��ES DO TECLADO COM A CLASSE Scanner
		Scanner scan = new Scanner(System.in); //CRIA��O DO OBJETO scan DA CLASSE Scanner
		// E INSTANCIA��O DO OBJETO scan DA CLASSE Scanner
		
		int numero1 = 0, numero2 = 0, resultado = 0;
		String nome, resposta;
		final int MEDIA = 60;//DECLARA��O DE UMA CONSTANTE, IMUTAVEL
		
		//INTERA��O
		System.out.println("Digite seu nome:");
		nome = scan.next();		
		System.out.println("Digite Primeiro numero:");
		numero1 = scan.nextInt();
		System.out.println("Digite Segundo numero:");
		numero2 = scan.nextInt();
		resultado = numero1 + numero2;
		
		System.out.println("Quer ver o Resultado? Digite 'sim' ou 'nao'");
		resposta = scan.next();
		
		//CONDI��O SWITCH
		switch (resposta) {
		case "sim":
			System.out.printf("Ol� %s, primeiro numero %d, segundo numero %d, soma = %d ", nome, numero1, numero2, resultado);
			System.out.printf("\n%s a Soma %d � "+(resultado < MEDIA ? "Menor" : "Maior")+" que %d", nome, resultado, MEDIA);//CONDI��O TERNARIA INCORPORADA
			break;
		default:
			System.out.println("Ent�o blz, Tchau !!!");
			break;
		}
		
	}
	
}
