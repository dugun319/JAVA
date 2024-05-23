package ch_02_ex02;

public class EqualityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 2 + 3;
		
		if(num1 == num2) {
			System.out.println("num1과 num2의 값이 같습니다");
		}
		
		if((num1 != num2) == false) {
			System.out.println("다르다고 하면 거짓말입니다!");
		}

	}

}
