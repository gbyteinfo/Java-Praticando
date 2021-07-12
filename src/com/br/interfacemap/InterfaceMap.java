package com.br.interfacemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class InterfaceMap {
	public static void main(String[] args) {
		String line = "\n";
		
		Map<String, Object> mapaNomes = new HashMap<String, Object>();
		
		mapaNomes.put("Nome", "Jorge Mira");
		mapaNomes.put("Idade", "35");
		mapaNomes.put("Cidade", "Hortolândia");
		mapaNomes.put("Filhos", "Sim");
		mapaNomes.put("Casado", "Sim");
		
		
		Set<Entry<String, Object>> setando = mapaNomes.entrySet();
		Iterator iterator = setando.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Object> entry = (Entry)iterator.next();
			System.out.printf("%sITERADOR => $s%s", setando , line, line);
		}
	}
}
