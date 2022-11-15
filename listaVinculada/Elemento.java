package listaVinculada;

public abstract class Elemento {
	private String nombre;
	
	public Elemento(String nombre) {
		this.nombre=nombre;
	}
	
	public abstract int cantidadAlumno();
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
