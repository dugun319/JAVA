package ch_04_ex03;

public class Ex_0301 {

	public static void main(String[] args) {
		// for 문을 이용하여 1부터 100까지 합을 연산
		// 3의 배수의 합을 구하라
		// 3의 배수의 합은 1683
		
		int sum = 0;
		
		for (int i = 0 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합은 " + sum);
	}

}
