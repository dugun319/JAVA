package ch_04_ex01;

public class Do_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i 	= 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);
		
		System.out.println("SUM : " + sum);
	}

}
