package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestListePays {

	public static void main(String[] args) {
		
		HashSet<Pays> listePays = new HashSet<>();
		
		Pays pays1 = new Pays("USA",332915000, 59495); //1.98e13
		Pays pays2 = new Pays("France", 65426000, 43551); // 284936772600
		Pays pays3 = new Pays("Allemagne", 83900000, 50206);
		Pays pays4 = new Pays("UK", 68207000, 43620);
		Pays pays5 = new Pays("Italie", 60367000, 37970);
		Pays pays6 = new Pays("Japon", 126051000, 42659);
		Pays pays7 = new Pays("Chine", 1444216000L, 16624);
		Pays pays8 = new Pays("Russie", 145912000, 28712);
		Pays pays9 = new Pays("Inde", 1393409000, 5174);
				
		
		listePays.add(pays1);
		listePays.add(pays2);
		listePays.add(pays3);
		listePays.add(pays4);
		listePays.add(pays5);
		listePays.add(pays6);
		listePays.add(pays7);
		listePays.add(pays8);
		listePays.add(pays9);
		
//		Iterator<Pays> iter = listePays.iterator();
//		double pibMax = 0;
//		String nomPaysMax = "";
//		while(iter.hasNext()) {
//			Pays pays = iter.next();
//			double pib = pays.getPIB();
//			String nomPays = pays.getNomPays();
//			if (pibMax < pib) {
//				pibMax = pib;
//				nomPaysMax = nomPays;
//				
//			}
//		}
//		System.out.println("Pays avec le plus de PIB/habitant : " + nomPaysMax + " / PIB/habitant : " + pibMax);
//		
//		Iterator<Pays> iter2 = listePays.iterator();
//		double pibMaxTotal = 0;
//		String nomPaysMaxTotal = "";
//		while(iter2.hasNext()) {
//			Pays pays = iter2.next();
//			double pib = pays.getPIB();
//			double pibTotal = pib * pays.getNbHabitants();
//			String nomPays = pays.getNomPays();
//			if (pibMaxTotal < pibTotal) {
//				pibMaxTotal = pibTotal;
//				nomPaysMaxTotal = nomPays;
//				
//			}
//		}
//		System.out.println("Pays avec le plus de PIB total : " + nomPaysMaxTotal + " / PIB Total : " + pibMaxTotal);
		
		Iterator<Pays> iter3 = listePays.iterator();
		Pays pays = iter3.next();
		double pibMin = pays.getPIB() * pays.getNbHabitants();
		String nomPaysMin = pays.getNomPays();
		while(iter3.hasNext()) {
			Pays paysSuivant = iter3.next();
			String nomPaysSuivant = paysSuivant.getNomPays();
			double pibTotal = paysSuivant.getPIB() * paysSuivant.getNbHabitants();
			if (pibMin > pibTotal) {
				pibMin = pibTotal;
				nomPaysMin = nomPaysSuivant;
				nomPaysMin.toUpperCase();
				iter3.remove();
			}
		}
		System.out.println(listePays);
		
	}

}
