package listaVinculada;

import java.util.Comparator;

public class Main {
	
	public static void main (String [] args) {
		Comparator<Object> comparadorInt= new ComparadorInt();
		ListaEnlazada lista= new ListaEnlazada(comparadorInt);
		
		Integer nodo10= 10;
		Integer nodo21= 21;
		Integer nodo1=1;
		Integer nodo5= 5;
		Integer nodo11= 11;
		
		lista.insertarElemento(nodo10);
		lista.insertarElemento(nodo21);
		lista.insertarElemento(nodo1);
		lista.insertarElemento(nodo5);
		lista.insertarElemento(nodo11);
		
		
		
		 for(Object n: lista)
		        System.out.print(" " + n);
		    System.out.println(" " );
	}

}
