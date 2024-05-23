package ch_02_ex03;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 32;
		int n2 = 10;
		int result;
		
		// '\n' cartridge return, carriage return, line feed, 줄바꿈, 개행
		// %d -> decimal
		// %c -> character
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		
		//몫
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		
		//나머지 modular
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);
		
	}

}
