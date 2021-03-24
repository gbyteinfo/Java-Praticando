package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("1 Aula Java", 21);
        Aula a2 = new Aula("2 Aula Colllections", 20);
        Aula a3 = new Aula("3 Aula Sets", 15);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        System.out.println(aulas);
        
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));      
        System.out.println(aulas);
	}

}
