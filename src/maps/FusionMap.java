package maps;

import java.util.HashMap;
import java.util.Map;

public class FusionMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		for (Map.Entry mapConcat : map3.entrySet()) {
			System.out.println("cl� : "+mapConcat.getKey() + " Valeur : " + mapConcat.getValue());
		}
	}

}
