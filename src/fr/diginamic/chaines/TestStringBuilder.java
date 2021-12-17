package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		 
		int nombre = 0;
		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis(); 
		for(int i = 1;i< 100000;i++) {
			builder.append(nombre+i);
		}
		long fin = System.currentTimeMillis();
		System.out.println(builder.toString());
		System.out.println("Temps d'execution : " + (fin - debut) + " millisecondes");

	}

}
