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
		
		//Recherche de la ville avec le plus grand nombre de caractére
//		Iterator<String> iter = listeVille.iterator();
//		Integer nombreCaracMax = 0;
//		String nomVilleMax = "";
//		while(iter.hasNext()) {
//			String ville = iter.next();
//			Integer nombreCarac = ville.length();
//			if (nombreCaracMax < nombreCarac) {
//				nombreCaracMax = nombreCarac;
//				nomVilleMax = ville;
//				
//			}
//					
//		}
//		System.out.println("Ville avec le plus de caractére : " + nomVilleMax);
		
		//Passer toute les villes en majuscule
//		Iterator<String> iter = listeVille.iterator();
//		while(iter.hasNext()){
//			String ville = iter.next();
//			ville = ville.toUpperCase();
//			System.out.println(ville);
//			
//		}
		
		//Supprimer dans la liste les ville commencer par la lettre N
		Iterator<String> iter = listeVille.iterator();
		while(iter.hasNext()){
			String ville = iter.next();
			char premiereLettre = ville.charAt(0);
			String strLettre = Character.toString(premiereLettre);
			if (strLettre.equals("N")) {
				iter.remove();
			}
			
		}
		System.out.println(listeVille);
		
	}

}
