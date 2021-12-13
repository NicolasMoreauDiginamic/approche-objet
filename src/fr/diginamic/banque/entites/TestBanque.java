package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		//Compte compte1 = new Compte("001B78",14.865);
		//System.out.println(compte1)
		
		Compte[] tabCompte = new Compte[2];
		Compte compte1 = new Compte("001B78",14.865);
		CompteTaux compte2 = new CompteTaux("001R36",9458.23,2);
		
		for(int i=0;i<tabCompte.length;i++) {
			if(i==0) {
				System.out.println(compte1);
			}
			else {
				System.out.println(compte2);
			}	
		}
		
	}

}
