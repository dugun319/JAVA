package ch_15_ex01;

public class exr_01 {

	public static void main(String[] args) {
		int a = 15;
		int b = 9;
		
		String str1 = "" + a + b ;
		String str2 = "" + b + a ;
		
		int result = (a > b) ? a+b : a-b;
		
		System.out.println(str1 + str2 + result);

	}

}
