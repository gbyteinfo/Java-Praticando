package com.br.jsoncriando;
import java.io.FileWriter;
import java.util.logging.Level;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.tools.javac.Main;

public class EscrevendoJson {
	
		//JSON COMPOSTO DE OBJETOS, QUE POR SUA VEZ 
		//É UM CONJUNTO DE CHAVE E VALOR
		public static void main(String[] args) {
			String line = "\n";
			
			/* INICIO OBJETOS CRIADOS */
			JSONObject objetoJson = new JSONObject(); //CRIANDO 1° OBJETO
				objetoJson.put("nome", "guilherme");
				objetoJson.put("senha", 121212);
				objetoJson.put("status", true);
			JSONObject objetoJson2 = new JSONObject(); //CRIANDO 2° OBJETO
				objetoJson2.put("nome", "gabriel");
				objetoJson2.put("senha", 161616);
				objetoJson2.put("status", false);
			JSONObject objetoJson3 = new JSONObject(); //CRIANDO 2° OBJETO
				objetoJson3.put("nome", "jorge");
				objetoJson3.put("senha", 232323);
				objetoJson3.put("status", false);
			/* FIM OBJETOS CRIADOS */
			
			/*INCIO LISTA DE DOCUMENTOS */
			JSONArray documentosListJsonArrayObjeto = new JSONArray();
				documentosListJsonArrayObjeto.put("RG");
				documentosListJsonArrayObjeto.put("CPF");
				objetoJson.put("documentos", documentosListJsonArrayObjeto); //ADD ARRAY DENTRO DO OBJETO
			JSONArray documentosListJsonArrayObjeto2 = new JSONArray();
				documentosListJsonArrayObjeto2.put("RG");
				documentosListJsonArrayObjeto2.put("CPF");
				objetoJson2.put("documentos", documentosListJsonArrayObjeto2); //ADD ARRAY DENTRO DO OBJETO 2
			JSONArray documentosListJsonArrayObjeto3 = new JSONArray();
				documentosListJsonArrayObjeto3.put("RG");
				documentosListJsonArrayObjeto3.put("CPF");
				documentosListJsonArrayObjeto3.put("CNH");
				objetoJson3.put("documentos", documentosListJsonArrayObjeto3); //ADD ARRAY DENTRO DO OBJETO 3
			
			/*FIM LISTA DE DOCUMENTOS*/

			/* INICIO LISTA DOS OBJETOS CRIADO */
			JSONArray objetosListJsonArray = new JSONArray(); //CRIANDO LISTA DE OBJETOS
				objetosListJsonArray.put(objetoJson); //ADICIONANDO OBJETO A LISTA
				objetosListJsonArray.put(objetoJson2); //ADICIONANDO OBJETO2 A LISTA
				objetosListJsonArray.put(objetoJson3); //ADICIONANDO OBJETO3 A LISTA
			/* FIM LISTA DOS OBJETOS CRIADOS*/
			
			/* INICIO CRIAÇÃO DE ARQUIVO .JSON */
			try(FileWriter arquivoJson = new FileWriter("usuarios2.json")){ //LOCAL ARQUIVO .JSON
				arquivoJson.write(objetosListJsonArray.toString()); //LENDO E ADICIONANDO O ARRAY AO ARQUIVO
				arquivoJson.flush();
			}catch (Exception e) {
				java.util.logging.Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
			}
			/* FIM CRIAÇÃO DE AQUIVO .JSON */
		}
	
}
