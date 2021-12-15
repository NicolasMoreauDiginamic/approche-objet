package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> listeInt = new ArrayList<>();
		listeInt.add(-1);
		listeInt.add(5);
		listeInt.add(7);
		listeInt.add(3);
		listeInt.add(-2);
		listeInt.add(4);
		listeInt.add(8);
		listeInt.add(5);
		
		for (Integer listeInteger : listeInt) {
			System.out.println(listeInteger);
		}
		
		System.out.println("Taille de la liste : " + listeInt.size());
		
		Object nombreMax = Collections.max(listeInt);
		System.out.println("Nombre le plus grand de la liste : " + nombreMax);
		
//		Iterator<Integer> iter = listeInt.iterator();
//		Integer min = iter.next();
//		while(iter.hasNext()) {
//			Integer nombre = iter.next();
//			if(nombre.compareTo(min)<0) {
//				iter.remove();
//			}
//			
//		}
//		System.out.println(listeInt);
		
		Iterator<Integer> iter2 = listeInt.iterator();
		while(iter2.hasNext()) {
			Integer nombre = iter2.next();
			if(nombre < 0) {
				nombre = -nombre;
			}	
		}
		System.out.println(listeInt);
	}

}
