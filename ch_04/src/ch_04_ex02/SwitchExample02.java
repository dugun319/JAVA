package ch_04_ex02;

public class SwitchExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    num;
		double randNum;
		
		randNum = (Math.random()*10000) % 6;
		System.out.println("Random number is " + randNum);
		
		//Math.random 0<= x <1 사이의 난수를 발생
		num = (int)(randNum) + 1;
				
		switch(num) {
			case 1 : 
				System.out.println("The number is '1'");
				break;
			case 2 : 
				System.out.println("The number is '2'");
				break;
			case 3 : 
				System.out.println("The number is '3'");
				break;
			case 4 : 
				System.out.println("The number is '4'");
				break;
			case 5 : 
				System.out.println("The number is '5'");
				break;
			default : 
				System.out.println("The number is '6'");
				break;

		}
		
		double remain = 314.1592 % 6;
		System.out.println(remain);

	}

}
