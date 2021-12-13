package fr.diginamic.banque.entites;

public class Compte {
	
	String numCompte;
	double soldeCompte;
	
	
	
	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}
	
	
	
}
