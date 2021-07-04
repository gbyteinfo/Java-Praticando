package com.br.classes;

import java.util.Scanner;

//MODIFICADOR DE ACESSO PUBLIC OU PRIVATE
public class Jogador {
	// scan QUE LE INFORMAÇÕES DO TECLADO COM A CLASSE Scanner
	Scanner scan = new Scanner(System.in); //CRIAÇÃO DO OBJETO scan DA CLASSE Scanner
	// E INSTANCIAÇÃO DO OBJETO scan DA CLASSE Scanner
	
	public Jogador(int n) {
		
		
		//INSTANCIAÇÃO DA CLASSE JOGADOR
		System.out.printf(" - posição => %d",n);
	}
	
}
