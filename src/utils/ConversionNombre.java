package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		// variables
		String nombreChaine = "56";
		int chaineConverti;
		int a = 856;
		int b = 135;
		int nombreMax;
		
		//Convertion de la chaine String en Integer
		chaineConverti = java.lang.Integer.parseUnsignedInt(nombreChaine);
		System.out.println(chaineConverti);
		
		//Calcul le nombre maximum entre a et b
		nombreMax = java.lang.Integer.max(a, b);
		System.out.println(nombreMax);
	}

}
