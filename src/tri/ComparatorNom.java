package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		int result = o1.getNomVille().compareTo(o2.getNomVille());
		return result;
	}
		

}

	
