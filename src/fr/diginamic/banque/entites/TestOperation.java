package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		String type;
		
		Operation[] tabOperation = new Operation[4];
		
		tabOperation[0] = new Credit("04/12/2021",1250);
		tabOperation[1] = new Credit("10/12/2021",643);
		tabOperation[2] = new Debit("06/12/2021",278);
		tabOperation[3] = new Debit("08/12/2021",55);
		
		for(int i=0;i<tabOperation.length;i++) {
			type = tabOperation[i].getType();
			System.out.println("Date Operation : " + tabOperation[i].getDateOpe() + " Montant : " + tabOperation[i].getMontantOpe() + " Type : " + type);
		}
	}

}
