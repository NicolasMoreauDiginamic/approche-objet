package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
	public static void main(String[] args) {
		
		HashSet<String> listePays = new HashSet<>();
		listePays.add("USA");
		listePays.add("France");
		listePays.add("Allemagne");
		listePays.add("UK");
		listePays.add("Italie");
		listePays.add("Japon");
		listePays.add("Chine");
		listePays.add("Russie");
		listePays.add("Inde");
		
		//Recherche du pays avec le plus grand nombre de caractére
		Iterator<String> iter = listePays.iterator();
		Integer nombreCaracMax = 0;
		String nomPays = "";
		while(iter.hasNext()) {
			String pays = iter.next();
			Integer nombreCarac = pays.length();
			if (nombreCaracMax < nombreCarac) {
				nombreCaracMax = nombreCarac;
				nomPays = pays;
				
			}
					
		}
		System.out.println("Pays avec le plus de caractére : " + nomPays);
		listePays.remove(nomPays);
		System.out.println(listePays);
	}
	
}
