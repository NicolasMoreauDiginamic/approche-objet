package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		
		List<String> listeVille = new ArrayList<>();
		listeVille.add("Nice");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Carcassonne");
		listeVille.add("Tarbes");
		
		Iterator<String> iter = listeVille.iterator();
		String ville = iter.next();
		Integer nombreCarac = ville.length();
		while(iter.hasNext()) {
			String villeSuivant = iter.next();
			Integer nombreCaracSuiv = villeSuivant.length();
			if (nombreCarac < nombreCaracSuiv) {
				nombreCarac = nombreCaracSuiv;
				System.out.println(villeSuivant);
				
			}
					
		}
		
	}

}
