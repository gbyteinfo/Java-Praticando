package com.br.heran�a;

//EXTENDENDO DA CLASSE VEICULO
public class Aviao extends Veiculo{
	private int categoria;
	
	//CONSTRUTOR DA CLASSE FILHA AVIAO
	public Aviao(String nome, int categoria) {
		super(nome,10);
		this.categoria = categoria;
	}
}
