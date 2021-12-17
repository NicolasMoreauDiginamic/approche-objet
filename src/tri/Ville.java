package tri;


public class Ville implements Comparable<Ville> {
	
	String nomVille;
	int nbHabitant;
	
	
	public Ville(String nomVille, int nbHabitant) {
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	@Override
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", nbHabitant=" + nbHabitant + "]";
	}
	
	public int compareTo(Ville ville) {
		int result = 0;
		//int result = this.nomVille.compareTo(ville.getNomVille());
		if (this.nbHabitant > ville.getNbHabitant()) {
			result = 1;
		}
		if (this.nbHabitant < ville.getNbHabitant()) {
			result = -1;
		}
		return result;
	}
	
}
