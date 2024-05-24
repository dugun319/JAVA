package ch_04_ex01;

public class If_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    a = Integer.parseInt(args[0]);
		int    b = Integer.parseInt(args[1]);
		String c = args[2];
		String d = args[3];
		int    e = Integer.parseInt(args[4]);

		
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		System.out.println("c -> " + c);
		System.out.println("d -> " + d);
		System.out.println();
		
		if(a > 0) {
			System.out.println("a is " + a);
			System.out.println("a is positive");
		} else {
			System.out.println("a is " + a);
			System.out.println("a is negative");			
		}
		System.out.println();
		
		if(e > 0) {
			System.out.println("e is " + e);
			System.out.println("e is positive");
		} else {
			System.out.println("e is " + e);
			System.out.println("e is negative");			
		}
		System.out.println();
		
		System.out.println("The program is ended");

	}

}
