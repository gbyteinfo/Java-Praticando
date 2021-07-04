package com.br.herança;

public class Carro {
	
	//DECLARANDO OS ATRIBUTOS
	public String line = "\n";
	public String separador = "-------------------------";
	private String nome;
	private Boolean ligado;
	private Boolean destruido;
	private int blindagem;
	private Boolean armamento;
	
	//CONSTRUTOR DA CLASSE
	public Carro(String nome) {
		this.nome = nome;
		this.ligado = true;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}
	
	//METODOS GET|SET
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
	public void setArmamento(Boolean armamento) {
		this.armamento = armamento;
	}
	public int getBlindagem() {
		return this.blindagem;
	}
	public void setBlindagem(int blindagem) {
		this.blindagem = blindagem;
	}
	
	//METODOS PARA ACAO
	public void sofrerDano(int dano) {
		this.blindagem -= dano;
		if(this.blindagem <= 0) {
			this.blindagem = 0;
			this.ligado=false;
			this.destruido=true;
		}		
	}
	
	//RETORNANDO/APRESENTANDO INFORMAÇÕES DO CARRO
	public void info() {
		System.out.printf("%s%s",line,separador);
		System.out.printf("%sCarro........: %s",line,this.nome);
		System.out.printf("%sLigado.......: %s",line,this.ligado ? "Sim" : "Não");
		System.out.printf("%sDestruido....: %s",line,this.destruido ? "Sim" : "Não");
		System.out.printf("%sBlindagem....: %d",line,this.blindagem);
		System.out.printf("%sArmamento....: %s",line,this.armamento ? "Sim" : "Não");
	}
	
	
	
	
	
	
	
	
}
