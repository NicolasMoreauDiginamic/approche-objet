package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	double tauxRem;
	
	
	public CompteTaux(String numCompte, double soldeCompte, double tauxRem) {
		super(numCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	public double getTauxRem() {
		return tauxRem;
	}

	public void setTauxRem(double tauxRem) {
		this.tauxRem = tauxRem;
	}

	@Override
	public String toString() {
		return "CompteTaux [tauxRem=" + tauxRem + ", numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}
	
	
}
