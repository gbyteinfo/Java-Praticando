package com.br.classes;

import java.util.Scanner;

//MODIFICADOR DE ACESSO PUBLIC OU PRIVATE
public class Jogador {
	// scan QUE LE INFORMA��ES DO TECLADO COM A CLASSE Scanner
	Scanner scan = new Scanner(System.in); //CRIA��O DO OBJETO scan DA CLASSE Scanner
	// E INSTANCIA��O DO OBJETO scan DA CLASSE Scanner
	
	public Jogador(int n) {
		
		
		//INSTANCIA��O DA CLASSE JOGADOR
		System.out.printf(" - posi��o => %d",n);
	}
	
}
