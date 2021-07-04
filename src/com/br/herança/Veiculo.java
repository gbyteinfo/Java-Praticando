package com.br.herança;

//SUPERCLASSE DE AVIAO
public class Veiculo {
	
	public String line = "\n";
	private String nome;
	private int tipo;
	public Veiculo(String nome, int tipo) {
		this.nome=nome;
		this.tipo = tipo;
	}
	
	public void info() {
		System.out.printf("Nome: %s%s ", this.nome, line);
		System.out.printf("Tipo: %d%s ", this.tipo, line);
		
	}
		
		
}
