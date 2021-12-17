package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
//		Calendar calendrier = new GregorianCalendar();
//		calendrier.set(2016,5,19,23,59,30);
//		Date date = calendrier.getTime();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		String dateFormate = dateFormat.format(date);
//		System.out.println(dateFormate);
		
//		Calendar calendrier = new GregorianCalendar();
//		calendrier.set(2020,11,17,16,53,45);
//		Date date = calendrier.getTime();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String dateFormate = dateFormat.format(date);
//		System.out.println(dateFormate);
		
		SimpleDateFormat date = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.FRANCE);
		System.out.println(date.format(new Date()));
		
		SimpleDateFormat date2 = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.CHINESE);
		System.out.println(date2.format(new Date()));
		
		SimpleDateFormat date3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy",Locale.GERMANY);
		System.out.println(date3.format(new Date()));
		
		SimpleDateFormat date4 = new SimpleDateFormat("EEEEE dd MMMMM yyyy",new Locale("ru","RU"));
		System.out.println(date4.format(new Date()));
	}

}
