package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestListeVille {

	public static void main(String[] args) {
		
		List<Ville> listeVille = new ArrayList<>();
		Ville ville1 = new Ville("Nice",343000);
		Ville ville2 = new Ville("Carcassonne",47800);
		Ville ville3 = new Ville("Narbonne",53400);
		Ville ville4 = new Ville("Lyon",484000);
		Ville ville5 = new Ville("Foix",9700);
		Ville ville6 = new Ville("Pau",77200);
		Ville ville7 = new Ville("Marseille",850700);
		Ville ville8 = new Ville("Tarbes",40600);
		
		listeVille.add(ville1);
		listeVille.add(ville2);
		listeVille.add(ville3);
		listeVille.add(ville4);
		listeVille.add(ville5);
		listeVille.add(ville6);
		listeVille.add(ville7);
		listeVille.add(ville8);
		
//		Iterator<Ville> iter = listeVille.iterator();
//		Integer nbHabitantMax = 0;
//		String nomVillemax = "";
//		while(iter.hasNext()) {
//			Ville ville = iter.next();
//			Integer nbHabitant = ville.getNbHabitant();
//			String nomVille = ville.getNomVille();
//			if (nbHabitantMax < nbHabitant) {
//				nbHabitantMax = nbHabitant;
//				nomVillemax = nomVille;
//				
//			}
//		}
//		System.out.println("Ville la plus peuplé : " + nomVillemax + " / Nb Habitant : " + nbHabitantMax);
		
		Iterator<Ville> iter = listeVille.iterator();
		while(iter.hasNext()) {
			Ville ville = iter.next();
			Integer nbHabitantVille = ville.getNbHabitant();
			if (nbHabitantVille > 100000) {
				ville.nomVille.toUpperCase();
			}
		}
	}

}
