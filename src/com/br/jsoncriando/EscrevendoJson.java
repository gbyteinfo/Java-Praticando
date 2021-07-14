package com.br.jsoncriando;

import java.io.FileWriter;
import java.util.logging.Level;

import com.br.org.JSONArray;
import com.br.org.JSONObject;
import com.sun.tools.javac.Main;

public class EscrevendoJson {
	
		//JSON COMPOSTO DE OBJETOS, QUE POR SUA VEZ 
		//É UM CONJUNTO DE CHAVE E VALOR
		public static void main(String[] args) {
			String line = "\n";
			
			/* INICIO OBJETOS CRIADOS */
			JSONObject objetoJson = new JSONObject(); //CRIANDO 1° OBJETO
			objetoJson.put("nome", "guilherme");
			objetoJson.put("senha", 252525);
			objetoJson.put("status", true);
			JSONObject objetoJson2 = new JSONObject(); //CRIANDO 2° OBJETO
			objetoJson2.put("nome", "gabriel");
			objetoJson2.put("senha", 363636);
			objetoJson2.put("status", false);
			/* FIM OBJETOS CRIADOS */
			
			/* INICIO LISTA DOS OBJETOS CRIADO */
			JSONArray objetosJsonArray = new JSONArray(); //CRIANDO LISTA DE OBJETOS
			objetosJsonArray.put(objetoJson); //ADICIONANDO OBJETO A LISTA
			objetosJsonArray.put(objetoJson2); //ADICIONANDO OBJETO A LISTA
			/* FIM LISTA DOS OBJETOS CRIADOS*/
			
			/* INICIO CRIAÇÃO DE ARQUIVO .JSON */
			try(FileWriter arquivoJson = new FileWriter("usuarios2.json")){ //LOCAL ARQUIVO .JSON
				arquivoJson.write(objetosJsonArray.toString()); //LENDO E ADICIONANDO O ARRAY AO ARQUIVO
				arquivoJson.flush();
			}catch (Exception e) {
				java.util.logging.Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
			}
			/* FIM CRIAÇÃO DE AQUIVO .JSON */
		}
	
}
