package com.br.jsoncriando;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.sun.tools.javac.Main;

import org.json.JSONArray;
import org.json.JSONObject;

public class CriandoJson {
		
	//JSON COMPOSTO DE OBJETOS, QUE POR SUA VEZ É UM CONJUNTO DE CHAVE E VALOR
	public static void main(String[] args) {
		
		String line = "\n";
		
		JSONObject objetoJson = new JSONObject(); //CRIANDO 1° OBJETO
		objetoJson.put("nome", "guilherme");
		objetoJson.put("senha", 102525);
		objetoJson.put("status", true);
		System.out.printf("Usuario 1 => %s%s", objetoJson.toString(), line);
		
		JSONObject objetoJson2 = new JSONObject(); //CRIANDO 2° OBJETO
		objetoJson2.put("nome", "gbyteinfo");
		objetoJson2.put("senha", 363636);
		objetoJson2.put("status", false);
		System.out.printf("Usuario 2 => %s%s", objetoJson2.toString(), line);
		
		JSONObject objetoJson3 = new JSONObject(); //CRIANDO 3° OBJETO
		objetoJson3.put("nome", "gabriel");
		objetoJson3.put("senha", 848484);
		objetoJson3.put("status", true);
		System.out.printf("Usuario 3 => %s%s", objetoJson3.toString(), line);
		
		JSONArray objetosJsonArray = new JSONArray(); //CRIANDO LISTA DE OBJETOS
		objetosJsonArray.put(objetoJson); //ADICIONANDO OBJETO A LISTA
		objetosJsonArray.put(objetoJson2); //ADICIONANDO OBJETO A LISTA
		objetosJsonArray.put(objetoJson3); //ADICIONANDO OBJETO A LISTA
		System.out.printf("Lista de objetos => %s", objetosJsonArray.toString());
		
		try(FileWriter arquivoJson = new FileWriter("usuarios.json")){ //LOCAL ARQUIVO .JSON
			arquivoJson.write(objetosJsonArray.toString()); //LENDO E ADICIONANDO O ARRAY AO ARQUIVO
			arquivoJson.flush();
		}catch (Exception ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex) ;
		}
	}
	
}
