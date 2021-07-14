package com.br.jsoncriando;

import com.br.org.JSONObject;

public class CriandoJson {
		
	//JSON COMPOSTO DE OBJETOS, QUE POR SUA VEZ É UM CONJUNTO DE CHAVE E VALOR
	public static void main(String[] args) {
		//objetoJson = Sacar Dinheiro
		
		
		JSONObject objetoJson = new JSONObject();
		
		objetoJson.put("Nome", "Jorge Mira");
		objetoJson.put("Profissão", "Desenvolvedor");
		
		
		System.out.printf("objeto => %s", objetoJson.get("Nome"));
	
	}
	
}
