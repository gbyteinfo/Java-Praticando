package com.br.scanner;
import java.util.Scanner;

public class DadosDoTeclado {
	
	public static void main(String[] args) {
		
		// scan QUE LE INFORMAÇÕES DO TECLADO COM A CLASSE Scanner
		Scanner scan = new Scanner(System.in); //CRIAÇÃO DO OBJETO scan DA CLASSE Scanner
		// E INSTANCIAÇÃO DO OBJETO scan DA CLASSE Scanner
		
		int numero1 = 0, numero2 = 0, resultado = 0;
		String resposta;
		
		System.out.println("Digite Primeiro numero");
		numero1 = scan.nextInt();
		System.out.println("Digite Segundo numero");
		numero2 = scan.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("Quer ver o Resultado? Digite 'sim' ou 'nao'");
		resposta = scan.next();
		
		switch (resposta) {
		case "sim":
			System.out.println("A soma dos Numeros é: " + resultado );
			break;
		default:
			System.out.println("Então blz, Tchau !!!");
			break;
		}
		
	}
	
}
