package ch_04_ex02;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    num;
		double randNum;
		
		randNum = Math.random()*6;
		//Math.random 0<= x <1 사이의 난수를 발생
		num = (int)(randNum) + 1;
		
		System.out.println(randNum);
		
		if(num == 1) {
			System.out.println("The number is '1'");
		} else if(num == 2) {
			System.out.println("The number is '2'");
		} else if(num == 3) {
			System.out.println("The number is '3'");
		} else if(num == 4) {
			System.out.println("The number is '4'");
		} else if(num == 5) {
			System.out.println("The number is '5'");
		} else {
			System.out.println("The number is '6'");
		}

	}

}
