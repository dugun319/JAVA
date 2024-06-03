package ch_09_ex01;

import java.util.Calendar;
import java.util.Date;

public class Calendar_01 {

	public static void main(String[] args) {
		Calendar cal	= Calendar.getInstance();
		int year		= cal.get(Calendar.YEAR);
		int month		= cal.get(Calendar.MONTH) + 1;
		int date		= cal.get(Calendar.DATE);
		
		System.out.println("Year\t= " + year);
		System.out.println("Month\t= " + month);
		System.out.println("Date\t= " + date);
		
		int hour	= cal.get(Calendar.HOUR);
		int minute	= cal.get(Calendar.MINUTE) + 1;
		int second	= cal.get(Calendar.SECOND);
		
		System.out.println("Hour\t= " + hour);
		System.out.println("Minute\t= " + minute);
		System.out.println("Second\t= " + second);
		
		
		Date dt = cal.getTime();
		
		System.out.println(dt);
		
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int day2 = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(day1 + ", " + day2);
		
		for(int i = 0 ; i <100 ; i++) {
			System.out.println(Math.random());
		}
		
	}

}
