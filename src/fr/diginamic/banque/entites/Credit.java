package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOpe, float montantOpe) {
		super(dateOpe, montantOpe);
	}

	@Override
	public String toString() {
		return "[dateOpe=" + dateOpe + ", montantOpe=" + montantOpe + "]";
	}
	
	public String getType() {
		return "DEBIT";
	}
	
	public float calcul(float montantOpe) {
		return + montantOpe;
	}

}
