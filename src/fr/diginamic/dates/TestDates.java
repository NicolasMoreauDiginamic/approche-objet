package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date dateJour = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(dateJour);
		System.out.println(date);
		
		@SuppressWarnings("deprecation")
		Date dateNew = new Date(116,4,19,23,59,30);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date2 = dateFormat2.format(dateNew);
		System.out.println(date2);
		
		Date dateJourSys = new Date();
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date3 = dateFormat3.format(dateJourSys);
		System.out.println(date3);
		
	}

}
