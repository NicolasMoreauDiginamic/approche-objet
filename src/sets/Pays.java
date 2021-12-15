package sets;

public class Pays {
	
	String nomPays;
	long nbHabitants;
	double pib;
	
	public Pays(String nomPays, long nbHabitants, double pib) {
		this.nomPays = nomPays;
		this.nbHabitants = nbHabitants;
		this.pib = pib;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPIB() {
		return pib;
	}

	public void setPIB(double pib) {
		this.pib = pib;
	}

	@Override
	public String toString() {
		return "Pays [nomPays=" + nomPays + ", nbHabitants=" + nbHabitants + ", pib=" + pib + "]";
	}	
	
}
