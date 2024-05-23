package ch_02_ex02;

import java.math.BigDecimal;

public class Ch_02_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "num " + 3 + 4;
		String str2 = 3 + 4 + " num";
		
		System.out.println("str1 -> " + str1);
		System.out.println("str2 -> " + str2);
		
		final double PI = 3.141592;
		final BigDecimal PI2 = new BigDecimal("3.141592");
		int radius = 6;
		double circum1 = 2 * radius * PI;
		
		System.out.println("circum1 -> " + circum1);
		System.out.println("circum2 -> " + PI2.multiply(BigDecimal.valueOf(radius * 2)));
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		int result1 = num1++;
		int result2 = ++num2;
		int result3 = num3--;
		int result4 = --num4;
		
		long salary = 1_000_000_000L;
		
		System.out.println(salary);
		
		if(result1 == 0)
			System.out.println("result1 -> " + result1);
		
		if(result2 == 1)
			System.out.println("result2 -> " + result2);
		
		if(result3 == 0)
			System.out.println("result3 -> " + result3);
		
		if(result4 == -1)
			System.out.println("result4 -> " + result4);
		
		int result5 = result1++;
		int result6 = --result2;
		int result7 = result3--;
		int result8 = ++result4;
		
		if(result5 == 0) {
			System.out.println("result5 -> " + result5);
		}
		if(result6 == 0) {
			System.out.println("result6 -> " + result6);
		}
		if(result7 == 0) {
			System.out.println("result7 -> " + result7);
		}
		if(result8 == 0) {
			System.out.println("result8 -> " + result8);
		}
		
		num1 = 5;
		num2 = 9;
		num3 = 3;
		
		int difference1 = (num1 > num2) ? num1 - num2 : num2 - num1;
		int difference2 = (num3 > num2) ? num3 - num2 : num2 - num3;
		
//		(num1 > num2) ? System.out.println("num1 is bigger") : 
//			System.out.println("num1 is bigger");
//		syntax error
		System.out.println("difference1 -> " + difference1);
		System.out.println("difference2 -> " + difference2);
		
		if(num1 > num2) {
			System.out.println("num1 is biiger");
			System.out.println("The difference is " + (num1-num2));
		} else {
			System.out.println("num2 is biiger");
			System.out.println("The difference is " + (num2-num1));
		}
		
		if(num3 > num2) {
			System.out.println("num3 is biiger");
			System.out.println("The difference is " + (num3-num2));
		} else {
			System.out.println("num2 is biiger");
			System.out.println("The difference is " + (num2-num3));
		}
				
		char charValue1 = '김';
		char charValue2 = '현';
		
		int intValue1 = charValue1;
		int intValue2 = charValue2;
		
		System.out.println("charValue -> " + charValue1 + charValue2);
		System.out.println("intValue -> " + intValue1 + intValue2);
		
	}

}
