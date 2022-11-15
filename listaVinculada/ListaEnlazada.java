package listaVinculada;

import java.util.Comparator;
import java.util.Iterator;

public class ListaEnlazada implements Iterable<Object>{
	
	private Nodo cabeza;
	private int size;
	private Comparator<Object> orden; 	
	
	public ListaEnlazada(Comparator<Object> orden) {
		cabeza=null;
		size=0;
		this.orden=orden;
	}
	
	public void setComparador(Comparator <Object> orden) {
		this.orden=orden;
	}
	
	public int size() {
		return size;
	}
	
	
	//INSERTAR NUEVO ELEMENTO AL PRINCIPIO
	public void insertarElemento(Object obj) {
		Nodo nuevo= new Nodo(obj);
		if(cabeza==null) {
			cabeza= nuevo;
		}
		else {
			Nodo temporal=cabeza;
			Nodo anterior=null;			
			while((this.orden.compare(temporal.getObjeto(), nuevo)<0) && (temporal!=null)) {
				anterior= temporal;
				temporal=temporal.obtenerSiguiente();				
			}
			if (temporal==null) { //LLEGO AL FINAL
				anterior.enlazarSiguiente(nuevo);
			}
			else {
				nuevo.enlazarSiguiente(temporal);
				anterior.enlazarSiguiente(nuevo);
			}
		}
		size++;
	}
	
	
	//ELIMINAR UN ELEMENTO DADA UNA POSICION	
	public void eliminarIndex(int index) {
		if (index==0) {
			cabeza=cabeza.obtenerSiguiente();
		}
		else {
			int contador=0;
			Nodo temporal=cabeza;
			while (contador<index-1) {
				temporal=temporal.obtenerSiguiente();
				contador++;
			}
			temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
		}
		size--;		
	}
	
	
	public Nodo obtenerNodo(int index) {
		int contador=0;
		Nodo temporal=cabeza;
		if (temporal!=null) {
			while (contador<index) {
				temporal=temporal.obtenerSiguiente();
				contador++;
			}
			return temporal;
		}
		else {
			return null;
		}
		
	}
	
	//OBTENER POSICION DE UN ELEMENTO
	public int obtenerPosicion(Object obj) {
		int contador=0;
		Nodo temporal=cabeza;
		while ((contador<=size()) && (temporal !=null)){
			if (temporal.getObjeto().equals(obj)){
				return contador;
			}
			else {
				temporal= temporal.obtenerSiguiente();
				contador++;
			}
		}
		return -1;			
	}
	
	//ELIMINAR TODAS LAS OCURRENCIAS
	public void eliminarOcurrencias(Object obj) {
		Nodo temporal= cabeza;
		if (temporal!=null) {
			for(int i=0; i<=size();i++) {
				if (temporal.getObjeto().equals(obj)) {
					eliminarIndex(i);
				}
				temporal= temporal.obtenerSiguiente();
			}			
		}	
		
		
		
	}
	

	@Override
	public Iterator<Object> iterator() {
		return new IteratorNodos();
	}
	


	
	
	
	private class IteratorNodos implements Iterator<Object>{
    	private int pos; //
    
        public IteratorNodos(){
           pos = 0;
        }
        
        @Override
        public boolean hasNext() {
            return pos < size();
            
        }
 
        @Override
        public Object next() {
        	Object proximo = obtenerNodo(pos).getObjeto();
            pos ++;
            return proximo;
        }
     }

			
	
	
}	
	
	





	
