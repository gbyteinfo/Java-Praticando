package com.br.classes;


//MODIFICADOR DE ACESSO PUBLIC OU PRIVATE
public class Jogador {
	
	String line = "\n";
	public int num =0;
	
	public Jogador(int n) {
		
		this.num = 10;
		
		//INSTANCIAÇÃO DA CLASSE JOGADOR
		System.out.printf("%sPosição => %d%s", line, n, line);
	}
}
