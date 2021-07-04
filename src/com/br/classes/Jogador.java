package com.br.classes;


//MODIFICADOR DE ACESSO PUBLIC OU PRIVATE
public class Jogador {
	
	String line = "\n";
	private final int maxVidas = 3;
	private int num = 99;
	private int vidas = 0;
	
	static boolean alerta = false;
	static int qtdJogadores = 0;
	
	public Jogador(int n) {
		this.num = 10;
		this.vidas = 6;
		//INSTANCIAÇÃO DA CLASSE JOGADOR
		System.out.printf("%sPosição => %d%s", line, n, line);
	}

	public int getVidas() {
		return this.vidas;
	}
	public void addVidas() {
		if(this.vidas < maxVidas) {
			this.vidas++;
		}
	}
	
	
}
