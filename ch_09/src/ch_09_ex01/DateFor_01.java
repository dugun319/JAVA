package ch_09_ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println("Today -> " + today);
		SimpleDateFormat sdf_01, sdf_02, sdf_03;
		SimpleDateFormat sdf_04, sdf_05, sdf_06;
		SimpleDateFormat sdf_07, sdf_08, sdf_09;
		
		sdf_01 = new SimpleDateFormat("yyyy-MM-dd"); 
		sdf_02 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); 
		sdf_03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd.SSS"); 
		sdf_04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd a"); 
		sdf_05 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다."); 
		sdf_06 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다."); 
		sdf_07 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다."); 
		sdf_08 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다."); 
		sdf_09 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일니다.");
		
		System.out.println("sdf_01 -> " + sdf_01.format(today));
		System.out.println("sdf_02 -> " + sdf_02.format(today));
		System.out.println("sdf_03 -> " + sdf_03.format(today));
		System.out.println("sdf_04 -> " + sdf_04.format(today));
		System.out.println("sdf_05 -> " + sdf_05.format(today));
		System.out.println("sdf_06 -> " + sdf_06.format(today));
		System.out.println("sdf_07 -> " + sdf_07.format(today));
		System.out.println("sdf_08 -> " + sdf_08.format(today));
		System.out.println("sdf_09 -> " + sdf_09.format(today));

	}

}
