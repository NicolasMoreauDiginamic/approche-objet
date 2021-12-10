package entites;

public class AdressePostale {

	int numRue;
	String libRue;
	int codePostal;
	String ville;
	
	AdressePostale(){
		
	}
	
	//Constructeur
	AdressePostale(int numRue,String libRue,int codePostal,String ville){
		this.numRue = numRue;
		this.libRue = libRue;
		this.codePostal = codePostal;
		this.ville = ville;	
	}
}
