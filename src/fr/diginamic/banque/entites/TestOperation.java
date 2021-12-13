package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		String type;
		
		Operation[] tabOperation = new Operation[4];
		Credit cred1 = new Credit("04/12/2021",1250);
		Credit cred2 = new Credit("10/12/2021",643);
		Debit deb1 = new Debit("06/12/2021",278);
		Debit deb2 = new Debit("08/12/2021",55);
		
		type = cred1.getType();
		
		for(int i=0;i<tabOperation.length;i++) {
			switch(i) {
			case 0 :
				type = cred1.getType();
				System.out.println(cred1 + " "+ type);
				break;
			case 1 :
				type = deb1.getType();
				System.out.println(deb1 + " "+ type);
				
				break;
			case 2 :
				type = deb2.getType();
				System.out.println(deb2 + " "+ type);
				break;
			default :
				type = cred2.getType();
				System.out.println(cred2 + " "+ type);
				break;	
			}
		}
	}

}
