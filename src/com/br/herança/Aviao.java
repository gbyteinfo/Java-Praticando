package com.br.herança;

//EXTENDENDO DA CLASSE VEICULO
public class Aviao extends Veiculo{
	
	public String line = "\n";
	private int categoria;
	
	//CONSTRUTOR DA CLASSE FILHA AVIAO
	public Aviao(String nome, int categoria) {
		super(nome,10);
		this.categoria = categoria;
	}
	public void info() {
		super.info();
		System.out.printf("Categoria: %s%s ", this.categoria, line);
	}
}
