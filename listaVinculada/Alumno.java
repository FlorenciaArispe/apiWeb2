package listaVinculada;

import java.util.ArrayList;

public class Alumno extends Elemento{
	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	
	public Alumno(String nombre, String apellido, int dni, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses= new ArrayList<String>();
	}
	
	public void addInteres(String s) {
		if(!intereses.contains(s)) {
			intereses.add(s);
		}
	}
	

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int cantidadAlumno() {
		return 1;
	}
	
	
	

}
