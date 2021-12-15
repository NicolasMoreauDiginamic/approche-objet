package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> keyIter = mapVilles.keySet().iterator();
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			System.out.println(key);
			
		}
		
		Iterator<String> valuesIter = mapVilles.values().iterator();
		while(valuesIter.hasNext()) {
			String value = valuesIter.next();
			System.out.println(value);
			
		}
		
		System.out.println("Taille de la Map : " + mapVilles.size());
	}

}
