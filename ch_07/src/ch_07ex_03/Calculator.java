package ch_07ex_03;

public class Calculator {

	public void powerOn() {
		System.out.println("Power On");
	}
	
	public int plus(int num1, int num2 ) {
		return num1 + num2;
	}
	
	public double divide(byte num1, byte num2 ) {
		return (double) num1 / num2;
	}

	public void powerOff() {
		System.out.println("Power Off");
	}
}
