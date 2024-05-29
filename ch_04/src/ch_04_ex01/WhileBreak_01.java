package ch_04_ex01;

public class WhileBreak_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
				
		while(true) {
			num++;
			sum += num;
			if(num == 5) break;
		}
		
		System.out.println("Sum : " + sum);
		System.out.println("The END");

	}

}
