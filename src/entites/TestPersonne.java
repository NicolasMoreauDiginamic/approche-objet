package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adresseP1 = new AdressePostale(22,"rue du Château",44300,"Nantes");
		AdressePostale adresseP2 = new AdressePostale(78,"rue du Port",85000,"les Sables d'Olonne");
		
		Personne personne1 = new Personne ("Dupond","Jean",adresseP1);
		Personne personne2 = new Personne ("Guillet","Anne", adresseP2);
		
		
		//personne1.nom = "Dupond";
		//personne1.prenom = "Jean";
		//personne1.adresse.numRue = 22;
		//personne1.adresse.libRue = "rue du Château";
		//personne1.adresse.codePostal = 44300;
		//personne1.adresse.ville = "Nantes";
		
		//personne2.nom = "Guillet";
		//personne2.prenom = "Anne";
		//personne2.adresse.numRue = 78;
		//personne2.adresse.libRue = "rue du Port";
		//personne2.adresse.codePostal = 85000;
		//personne2.adresse.ville = "les Sables d'Olonne";
		
		
	}

}
