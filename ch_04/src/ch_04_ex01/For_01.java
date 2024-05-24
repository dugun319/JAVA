package ch_04_ex01;

public class For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 1 ; i<=10 ; i++) {
			sum += i;
			System.out.println(i + "까지의\t합은 " + sum);
		}
		
		System.out.println("sum : " + sum);

	}

}
