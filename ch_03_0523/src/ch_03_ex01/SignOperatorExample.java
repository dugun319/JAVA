package ch_03_ex01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		
		//int result1 += x;
		//compile error
		//int result1;
		//result1 += x;
		
		//result1 = result1 + x;
		int result2 = 0;
		System.out.println("result2의 초기값 -> " + result2);
		
		result2 = -x;
		
		//result2 = result2 - (-100) = restul2 + 100
		
		System.out.println("result1 -> " + result1);
		System.out.println("result2 -> " + result2);
		
		
		short s = 100;
		//short result3 = -s;
		//compile error
		
		int result3 = -s;
		System.out.println("result3 -> " + result3);
		

	}

}
