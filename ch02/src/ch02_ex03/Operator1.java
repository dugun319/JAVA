package ch02_ex03;

public class Operator1 {

	public static void main(String[] args) {
		int n1 = 33;
		int n2 = 10;
		int result;
		
		// + - * / % 사칙연산자 
		result = n1 + n2;
		//             decimal  char
		System.out.printf("%d   %c    %d = %d\n",  n1, '+', n2, result);
		System.out.println(n1 + "    + " + n2 + " = " + result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n",  n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n",  n1, '*', n2, result);
		result = n1 /  n2;
		System.out.printf("%d %c %d = %d\n",  n1, '/', n2, result);
		result = 10 %  3;  // 나머지
		System.out.printf("%d %c %d = %d\n",  10,  '%', 3, result);
	}

}
