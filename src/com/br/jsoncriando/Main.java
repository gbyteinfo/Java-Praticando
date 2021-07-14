package com.br.jsoncriando;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
	
	public static void main(String[] args) {
		
		/* INICIO CAPTURA E CONVERTE A LISTA JSON EM OBJETO JAVA, DEPOIS JSONArray */
		JSONParser jsonParser = new JSONParser(); //INSTANCIANDO O CONVERSOR JSON
		try(FileReader documentoFileR = new FileReader("usuarios2.json")){ //CAPTURANDO A LISTA JSON
			
			Object documentoObj = jsonParser.parse(documentoFileR); //CONVERTENDO PARA OBJETO JAVA
			JSONArray documentosLista = (JSONArray) documentoObj; // CONVERTENDO PARA JSONArray
			documentosLista.forEach(pessoa -> parserPessoa((JSONObject) pessoa)); //CHAMANDO METODO E PASSANSO O OBJETO JSON PESSOA
			
		}catch (Exception e) {

		}
		/* FIM CAPTURA E CONVERTE A LISTA JSON EM OBJETO JAVA, DEPOIS JSONArray */
	}
	
	/* INICIO METODO PARA CONVERTER E MOSTRAR A LISTA */
	private static void parserPessoa(JSONObject pPessoa) {
		System.out.println(pPessoa.get("nome"));
		System.out.println(Integer.parseInt(pPessoa.get("senha").toString()));
		System.out.println(Boolean.parseBoolean(pPessoa.get("status").toString()));
		
		System.out.println("Documentos: ");
		JSONArray documentosArray = (JSONArray) pPessoa.get("documentos");
		for (Object documentos : documentosArray) {
			System.out.print(documentos + " ");
		}
		System.out.println("\n----------------");
	}
	/* FIM METODO PARA CONVERTER E MOSTRAR A LISTA */
}

//estudo - BLSoft Simplesmente Java - youtube
//https://www.youtube.com/watch?v=6fCNWNc8rcI&list=PLt2CbMyJxu8iWelL5ZsosimrLZRwxCK7a&index=9
