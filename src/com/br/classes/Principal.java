package com.br.classes;

import java.util.Scanner;

public class Principal {
	
	//METODO MAIN, ELE SEMPRE IRA INDICAR QUE PROGRAMA STARTA AQUI
	public static void main(String[] args) {
		String line = "\n";
		
		int num = 0;
		
		Jogador j1 =  new Jogador(num++);//OBJETO J1 DO TIPO JOGADOR
		Jogador j2 = new Jogador(num++);//OBJETO J2 DO TIPO JOGADOR
		Jogador j3 = new Jogador(num++);//OBJETO J3 DO TIPO JOGADOR	
		//FIM DA INSTANCIAÇÃO DA CLASSE JOGADOR
		
		System.out.printf("%s%d",line, j1.num);
		System.out.printf("%s%d",line, j2.num);
		System.out.printf("%s%d",line, j3.num);
	}
	
}
