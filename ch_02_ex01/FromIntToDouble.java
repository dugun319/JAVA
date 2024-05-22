package ch_02_ex01;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456789;
		int num2 = 123456789;
		
		double num3 = num2;
		System.out.println("num3 -> " + num3);
		
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println("result -> " + result);
		

	}

}
