package ch_09_ex01;

import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current Time\t: " + now);
		
		LocalDateTime tarDateTime = now.plusYears(1);
		System.out.println("Target Time\t: " + tarDateTime);
		
		tarDateTime = now.minusDays(5);
		System.out.println("Target Time\t: " + tarDateTime);
		
		tarDateTime = now.plusDays(100);
		System.out.println("Target Time\t: " + tarDateTime);
		
		tarDateTime = now.plusHours(7);
		System.out.println("Target Time\t: " + tarDateTime);
		
		tarDateTime = now.minusMinutes(9);
		System.out.println("Target Time\t: " + tarDateTime);
		
		tarDateTime = now.plusSeconds(30);
		System.out.println("Target Time\t: " + tarDateTime);
	}

}
