package com.br.heran�a;

public class CarroCombate extends Carro{
	
	private final int MAX_ARMAMENTO=100;
	private final int MIN_ARMAMENTO=0;
	private int qtdeArmamento;
	
	public CarroCombate(String nome, int blindagem) {
		super(nome);//CLAMANDO CONSTRUTOR DA CLASSE PAI
	}

}
