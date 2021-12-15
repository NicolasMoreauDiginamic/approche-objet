package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Integer> ville = new HashMap<String, Integer>();
		ville.put("Nice",343000);
		ville.put("Carcassonne",47800);
		ville.put("Narbonne",53400);
		ville.put("Lyon",484000);
		ville.put("Foix",9700);
		ville.put("Pau",77200);
		ville.put("Marseille",850700);
		ville.put("Tarbes",40600);
		
		
		Iterator<Entry<String, Integer>> villeFrance = ville.entrySet().iterator();
		Entry<String, Integer> mapentry = villeFrance.next();
		Integer nbHabitantMin = (Integer) mapentry.getValue();
		String nomVilleMin = "";
        while (villeFrance.hasNext()) {
          Entry<String, Integer> mapentrySuivant = villeFrance.next();
          Integer nbHabitant = (Integer) mapentrySuivant.getValue();
          String nomVille = (String) mapentrySuivant.getKey();
          if (nbHabitantMin >nbHabitant) {
        	  nbHabitantMin = nbHabitant;
        	  nomVilleMin = nomVille;
        	  ville.remove(nomVilleMin);
          }
        }
		System.out.println(ville);
	}

}
