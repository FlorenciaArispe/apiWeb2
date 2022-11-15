package listaVinculada;

public class Nodo {
	private Object objeto;
	private Nodo siguiente;
	
	public Nodo (Object objeto) {
		this.objeto= objeto;
		this.siguiente= null;
	}
	
	public void enlazarSiguiente(Nodo n) {
		this.siguiente=n;
	}
	
	public Nodo obtenerSiguiente() {
		return siguiente;
	}
	
	public Object getObjeto() {
		return this.objeto;
	}
	
	public void setValor(Object obj) {
		this.objeto=obj;
	}
	
	@Override	
	public String toString() {
		return this.objeto.toString();
	}


	
	

}
