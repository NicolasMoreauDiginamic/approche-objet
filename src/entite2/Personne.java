package entite2;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne() {
		
	}
	//Premier constructeur
	public Personne(String nom,String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//Deuxième constructeur
	public Personne(String nom,String prenom,AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	//Methode 1 : renvois le nom et prénom avec le nom de femille en majuscule
	public String SetNomPrenom(String nom, String prenom) {
		return nom.toUpperCase() + " " + prenom;
	}
	
	//Methode 2 : renvois le nom modifier
	public String SetNom(String nom) {
		String modifNom = nom + ".........";
		return modifNom;
	}
	
	//Methode 3 : renvois le prénom modifier
	public String SetPrenom(String prenom) {
		String modifPrenom = prenom + ".....";
		return modifPrenom;
	}
	
	//Methode 4 : renvois l'adresse modifier
	public AdressePostale SetAdresse(AdressePostale adresse) {
		AdressePostale modifAdresse = adresse;
		return modifAdresse;
	}
	
	//Methode 5 : retourne le nom
		public String GetNom(String nom) {
			return nom;
		}
		
	//Methode 6 : retourne le prénom
	public String GetPrenom(String prenom) {
		return prenom;
	}
	
	//Methode 7 : retourne l'adresse
	public AdressePostale GetAdresse(AdressePostale adresse) {
		return adresse;
	}
}
