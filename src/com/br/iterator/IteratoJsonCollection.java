package com.br.iterator;

import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class IteratoJsonCollection {
	 public static void main(String[] args) throws JSONException {
		 
		 Scanner scan = new Scanner(System.in);
		 String line = "\n";
		 
		 JSONObject objeto_json = new JSONObject();
		 
		 System.out.printf("Digite o nome: %s", line);
		 String nomeDig = scan.next();
		 System.out.print(line);
		 
		 System.out.printf("Digite sua idade: %s", line);
		 int idadeDig = scan.nextInt();
		 System.out.print(line);
		 
		 System.out.printf("Digite sua cidade: %s", line);
		 String cidadeDig = scan.next();
		 System.out.print(line);
		 
		 System.out.printf("Você tem Filhos? %s", line);
		 String fDig = scan.next();
		 Boolean filhosDig;
		 if(fDig != "sim") {
			 filhosDig = true;
		 }else {
			 filhosDig = false;
		 }
		 System.out.print(line);
		 
		 objeto_json.put("Nome", nomeDig);
		 objeto_json.put("Idade", idadeDig);
		 objeto_json.put("Cidade", cidadeDig);
		 objeto_json.put("Filhos", filhosDig );
		 
		 
		 //RETORNO 1 - OBJETO SERIALIZADO
		 String obj_json = objeto_json.toString();
		 System.out.printf("Objeto 1 => %s", obj_json);
		 System.out.printf("%s%s", line, line);
		 
		 //RETORNO 2 - ALTERANDO O NOME
		 System.out.printf("%sDigite seu Sobrenome: %s",line,line);
		 String snomeDig = scan.next();
		 System.out.printf(line);
		 objeto_json.put("Nome", nomeDig+" "+snomeDig);
		 obj_json = objeto_json.toString();
		 System.out.printf("Objeto 2 => %s", obj_json );
		 System.out.printf("%s%s",line, line);
		 
		 //RETORNO 3- RECUPERANDO CADA ITEM DO OBJETO COM GET
		 String nome = objeto_json.getString("Nome");
		 int idade = objeto_json.getInt("Idade");
		 String cidade = objeto_json.getString("Cidade");
		 Boolean filhos = objeto_json.getBoolean("Filhos");
		 //faltou o getJSONArray() 
		 
		 System.out.printf("Objeto 3 com get %s", line);
		 System.out.printf("Nome => %s%s", nome, line);
		 System.out.printf("Idade => %d%s", idade, line);
		 System.out.printf("Cidade => %s%s", cidade, line);
		 System.out.printf("Filhos => %s%s", filhosDig ? "Tem Sim" : "Tem Não", line );
		 
		 
		 
	}
}
