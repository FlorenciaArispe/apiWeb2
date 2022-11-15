package listaVinculada;

import java.util.Comparator;

public class ComparadorInt implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer aux1 = (Integer)o1;
    	Integer aux2 = (Integer)o2;
    	return aux1.compareTo(aux2);  
	}
	

}
