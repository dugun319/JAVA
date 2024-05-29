package ch_07ex_03;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result1 = myCal.plus(5, 6);
		System.out.printf("result1 = %d\n", result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCal.divide(x, y);
		System.out.printf("result2 = %4.2f\n", result2);
		
		myCal.powerOff();
		

	}

}
