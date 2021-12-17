package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestTriVille {

	public static void main(String[] args) {
		
		List<Ville> listeTri = new ArrayList<>();
		Ville ville1 = new Ville("Nice",343000);
		Ville ville2 = new Ville("Carcassonne",47800);
		Ville ville3 = new Ville("Narbonne",53400);
		Ville ville4 = new Ville("Lyon",484000);
		Ville ville5 = new Ville("Foix",9700);
		Ville ville6 = new Ville("Pau",77200);
		Ville ville7 = new Ville("Marseille",850700);
		Ville ville8 = new Ville("Tarbes",40600);
		
		listeTri.add(ville1);
		listeTri.add(ville2);
		listeTri.add(ville3);
		listeTri.add(ville4);
		listeTri.add(ville5);
		listeTri.add(ville6);
		listeTri.add(ville7);
		listeTri.add(ville8);
		
//		Collections.sort(listeTri);
//		for(Ville v : listeTri) {
//			System.out.println(v);
//		}
		
		System.out.println("Tri par Nb Habitant : ");
		Collections.sort(listeTri,new ComparatorHabitant());
		for(Ville v : listeTri) {
			System.out.println(v);
		}
		System.out.println("-----------------");
		System.out.println("Tri par Nom de ville : ");
		Collections.sort(listeTri,new ComparatorNom());
		for(Ville v : listeTri) {
			System.out.println(v);
		}
	}

}
