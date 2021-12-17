package fichier;


//11;Île-de-France;95;2;01;555;Saint-Gratien;20 824;178;21 002;
public class RecensementVille {

	String nbHabitant;
	String nomVille;
	String codeDepartement;
	String popuTotal;
	
	public RecensementVille(String nomVille,String nbHabitant, String codeDepartement, String popuTotal) {
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
		this.codeDepartement = codeDepartement;
		this.popuTotal = popuTotal;
	}

	public String getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(String nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getPopuTotal() {
		return popuTotal;
	}

	public void setPopuTotal(String popuTotal) {
		this.popuTotal = popuTotal;
	}

	public RecensementVille() {
		
	}
	
	
	
	
}
