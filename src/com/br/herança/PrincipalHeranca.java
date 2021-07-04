package com.br.herança;

public class PrincipalHeranca {
	public static void main(String[] args) {
		
		Aviao v1 = new Aviao("Asas Quebradas", 1);
		v1.info();
		
		
		Carro c1 = new Carro("Honda-Civic");
		Carro c2 = new Carro("Honda-CRV");
		
		CarroCombate cc1 = new CarroCombate("Destruidor", 100);
		CarroCombate cc2 = new CarroCombate("Aniquilador", 50);
		
		//COMEÇO DA BATALHA
		cc1.atirar();cc1.atirar();cc1.atirar();
		cc2.atirar();cc2.atirar();
		
		c1.setBlindagem(10);//CARRO 1 RECEBENDO 10 DE BLINDAGEM
		c1.sofrerDano(2);//RECEBEU 2 DANOS
		c2.setBlindagem(5);//CARRO 2 RECEBENDO 5 DE BLINDAGEM
		c2.sofrerDano(3);//RECEBEU 3 DANOS
		
		//APRESENTANDO INFORMAÇÃO DOS CARROS DEPOIS DA BATALHA
		c1.info();
		c2.info();
		cc1.info();
		cc2.info();		
		
		
		
		
		
	}
}
