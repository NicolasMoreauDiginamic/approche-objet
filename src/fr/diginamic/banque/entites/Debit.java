package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, float montantOpe) {
		super(dateOpe, montantOpe);
	}
	
	@Override
	public String toString() {
		return "[dateOpe=" + dateOpe + ", montantOpe=" + montantOpe + "]";
	}
	
	public String getType() {
		return "CREDIT";
	}
	
	public float calcul(float montantOpe) {
		return - montantOpe;
	}

}
