package ch_04_ex01;

public class While_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문 변수에 대한 초기값은 반드시 while문 보다 먼저 선언되어야 한다.
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			System.out.println(i + "까지의\t합은 " + sum);
			i++;
		}
		
		System.out.println("합계 : " + sum);

	}

}
