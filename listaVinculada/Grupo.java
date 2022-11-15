package listaVinculada;

import java.util.ArrayList;

public class Grupo extends Elemento {
	private ArrayList<Elemento> componentes;
	
	public Grupo(String nombre) {
		super(nombre);
		this.componentes= new ArrayList<Elemento>();
	}
	
	public void addComponentes(Elemento e) {
		if (!componentes.contains(e)) { //VER SI HAY QUE IMPLEMENTAR EQUALS
			componentes.add(e);
		}
	}

	@Override
	public int cantidadAlumno() {
		int cantidad=0;
		for(Elemento e:this.componentes) {
			cantidad+= e.cantidadAlumno();
			
		}
		return cantidad;
	}

}
