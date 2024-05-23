package ch_02_ex03;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		//%s -> String		
		result = n1 > n2;
		System.out.printf("%d %s %d = %b\n", n1, "> ", n2, result);
		
		result = n1 < n2;
		System.out.printf("%d %s %d = %b\n", n1, "< ", n2, result);
		
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
		
		result = n1 <= n2;
		System.out.printf("%d %s %d = %b\n", n1, "<=", n2, result);
		
		//나머지 modular
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);
		
		//나머지 modular
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);

	}

}
