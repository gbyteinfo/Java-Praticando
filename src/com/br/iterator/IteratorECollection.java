package com.br.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorECollection {

 public static void main(String args[]) {
	 
	//ADICONADO GENERIC EM OBJETOS DA LISTA DO TIPO STRING
    ArrayList<String> letra = new ArrayList<String>();

    letra.add("C");
    letra.add("A");
    letra.add("E");
    letra.add("B");
    letra.add("D");
    letra.add("F");

    //ITERATOR USADO PARA MOSTRAR O CONTERUDO DA LISTA
    //USADO OS METODOS .NEXT() E . PREVIOUS()
    System.out.print("Lista Original: ");
    Iterator<String> iterador = letra.iterator();
    while(iterador.hasNext()) {
       Object element = iterador.next();
       System.out.print(element + " ");
    }
    System.out.println();

    //MODIFICAÇÃO 1 - INCLUSO + NO FINAL DE CADA ITEM DA LISTA
    ListIterator<String> litr = letra.listIterator();
    
    while(litr.hasNext()) {
       Object element = litr.next();
       litr.set(element + "+");
    }
    System.out.print("Lista Modificada 1: ");
    iterador = letra.iterator();
    while(iterador.hasNext()) {
       Object element = iterador.next();
       System.out.print(element + " ");
    }
    System.out.println();

    //MODIFICAÇÃO 2 - INCLUSO + NO FINAL E ALTERADO ORDEM DE EXIBIÇÃ
    System.out.print("Lista Modificada 2: ");
    while(litr.hasPrevious()) {
       Object element = litr.previous();
       System.out.print(element + " ");
     }
     System.out.println();
  }
}