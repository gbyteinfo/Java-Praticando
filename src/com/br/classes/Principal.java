package com.br.classes;

import java.util.Scanner;

public class Principal {
	
	//METODO MAIN, ELE SEMPRE IRA INDICAR QUE PROGRAMA STARTA AQUI
	public static void main(String[] args) {
		String line = "\n";
		
		int num = 0;
		
		System.out.printf("%sRetornou => %b%s",line, Jogador.alerta ? "Sim" : "Nao", line);
		
		Jogador j1 =  new Jogador(++num);//OBJETO J1 DO TIPO JOGADOR
		Jogador j2 = new Jogador(++num);//OBJETO J2 DO TIPO JOGADOR
		Jogador j3 = new Jogador(++num);//OBJETO J3 DO TIPO JOGADOR	
		//FIM DA INSTANCIAÇÃO DA CLASSE JOGADOR
		
		
	}
	
}
