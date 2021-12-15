package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <100;i++) {
			list.add(i+1);
		}
		
		System.out.println("Taille de la liste : " + list.size());
	}

}
