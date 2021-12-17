package listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville ville1 = new Ville();
		Ville ville2 = new Ville();
		Ville ville3 = new Ville();
		ville1.setNomVille("Paris");
		ville2.setNomVille("Nice");
		ville3 = ville1;
		
		boolean result = ville1.equals(ville2);
		System.out.println(result);
		boolean result2 = ville3.equals(ville1);
		System.out.println(result2);
		boolean result3 = ville1 == ville2;
		System.out.println(result3);
	}

}
