package com.br.herança;

public class Carro {
	
	public String line = "\n";
	
	private String nome;
	private Boolean ligado;
	private Boolean destruido;
	private int blindagem;
	private Boolean armamento;
	
	public Carro(String nome) {
		this.nome = nome;
		this.ligado = false;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}
	
	public String getNome() {
		return this.nome;
	}
	public Boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	public Boolean getDestruido() {
		return this.destruido;
	}
	public void setDestruido(Boolean destruido) {
		this.destruido = destruido;
	}
	public Boolean getArmamento() {
		return this.armamento;
	}
	public int getBlindagem() {
		return this.blindagem;
	}
	
	public void sofreDano(int dano) {
		this.blindagem = dano;
		if(this.blindagem <=0) {
			this.blindagem = 0;
			this.ligado=false;
			this.destruido=true;
		}		
	}
	
	public void info() {
		System.out.printf("%s",line);
		System.out.printf("%s",line);
		System.out.printf("%s",line);
		System.out.printf("%s",line);
		System.out.printf("%s",line);
	}
	
	
	
	
	
	
	
	
}
