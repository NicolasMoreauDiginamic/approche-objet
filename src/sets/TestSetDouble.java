package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		for(Double mySet : set) {
			System.out.println(mySet);
		}
		
		Object nombreMax = Collections.max(set);
		System.out.println("Nombre le plus grand de la liste : " + nombreMax);
		
//		Iterator<Double> iter = set.iterator();
//		while(iter.hasNext()) {
//			Double nombre = iter.next();
//			if(nombre<0) {
//				iter.remove();
//			}
//			
//		}
//		System.out.println(set);
	}

}
