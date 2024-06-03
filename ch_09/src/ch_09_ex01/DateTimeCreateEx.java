package ch_09_ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateEx {

	public static void main(String[] args) {

		LocalDate curDate = LocalDate.now();
		System.out.println("Current Date\t: " + curDate);		
		LocalDate tarDate = LocalDate.of(2024, 11, 18);
		System.out.println("Target Date\t: " + tarDate + "\n");
		
		LocalTime curTime = LocalTime.now();
		System.out.println("Current Time\t: " + curTime);
		LocalTime tarTime = LocalTime.of(6, 30, 10, 0);
		System.out.println("Target Time\t: " + tarTime + "\n");
		
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("Current Date Time\t: " + curDateTime);
		LocalDateTime tarDateTime = LocalDateTime.of(2024, 11, 18, 17, 50, 10, 0);
		System.out.println("Target Date Time\t: " + tarDateTime + "\n");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Universal Time Coordinated : " + utcDateTime);
		
	}

}
