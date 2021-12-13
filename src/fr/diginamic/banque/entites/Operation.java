package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String dateOpe;
	protected float montantOpe;
	protected String type;
	
	
	public Operation(String dateOpe, float montantOpe) {
		this.dateOpe = dateOpe;
		this.montantOpe = montantOpe;
	}
	
	public String getType(String type) {
		return type;
	}
	
	public String getDateOpe() {
		return dateOpe;
	}
	
	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}
	
	public float getMontantOpe() {
		return montantOpe;
	}
	
	public void setMontantOpe(float montantOpe) {
		this.montantOpe = montantOpe;
	}
	
}
