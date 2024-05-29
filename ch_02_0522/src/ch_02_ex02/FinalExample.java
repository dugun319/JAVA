package ch_02_ex02;

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		double radius = 2.0;
		double circum;
		circum = 2 * PI * radius;
		
		//PI = 3.141592;
		//PI++;
		//compile error
		//상수이기 때문에
		
		System.out.println("circum -> " + circum);

	}

}
