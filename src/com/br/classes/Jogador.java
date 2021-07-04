package com.br.classes;


//MODIFICADOR DE ACESSO PUBLIC OU PRIVATE
public class Jogador {
	
	String line = "\n";
	private final int maxVidas = 3;
	private int num = 0;
	private int vidas = 0;
	static boolean alerta = false;
	static int qtdJogadores = 0;
	static int pontosJogadores = 0;
	
	public Jogador(int n) {
		this.num = n;
		this.vidas = 1;
		
		System.out.printf("%sJogador numero => %d criado!%s", line, n, line);
		qtdJogadores++;
	}
	
	
	public int getVidas() {
		return this.vidas;
	}
	public void addVidas() {
		if(this.vidas < maxVidas) {
			this.vidas++;
		}
	}
	
	static void pontos() {
		pontosJogadores+=10;
	}
	
	public void info() {
		System.out.printf("%sTotal Jogadores: %d",line, qtdJogadores);
		System.out.printf("%sJogador Atual: %d",line, this.num );
		System.out.printf("%sVidas: %d",line, this.vidas );
		System.out.printf("%sAlerta: %s",line, (alerta ? "Sim" : "Não"));
		System.out.printf("%sPontos do Jogador: %d", line, pontosJogadores);
	}
	
	
}
