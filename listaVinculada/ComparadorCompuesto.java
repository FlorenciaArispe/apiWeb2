package listaVinculada;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Alumno>{
	Comparator<Alumno> c1;
	Comparator<Alumno> c2;
	public ComparadorCompuesto(Comparator<Alumno> c1, Comparator<Alumno> c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override
	public int compare(Alumno o1, Alumno o2) {
		int resultado;
		resultado = c1.compare(o1, o2);
			if(resultado == 0);
				c2.compare(o1, o2);
			return resultado;
	}

}
