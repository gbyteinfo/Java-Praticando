package com.br.classes;

public class Principal {
	
	//METODO MAIN, ELE SEMPRE IRA INDICAR QUE PROGRAMA STARTA AQUI
	public static void main(String[] args) {
		String line = "\n";
		int num = 0;
		
		
		Jogador j1 =  new Jogador(++num);//OBJETO J1 DO TIPO JOGADOR
		Jogador j2 = new Jogador(++num);//OBJETO J2 DO TIPO JOGADOR
		Jogador j3 = new Jogador(++num);//OBJETO J3 DO TIPO JOGADOR
		Jogador j4 = new Jogador(++num);//OBJETO J3 DO TIPO JOGADOR
		Jogador j5 = new Jogador(++num);//OBJETO J3 DO TIPO JOGADOR
		
		
		j1.info();
		System.out.printf(line);
		j2.info();
		System.out.printf(line);
		j3.info();
		System.out.printf(line);
		j4.info();
		System.out.printf(line);
		j5.info();
		
		
		
	}
	
}
