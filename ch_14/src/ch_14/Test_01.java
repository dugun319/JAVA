package ch_14;

public class Test_01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int aa;
		int bb;
		
		aa = ++a;	//++a -> 6, aa -> 6
		bb = b++;	//bb -> 5, b -> 6
		
		System.out.println("aa = " + aa + " bb = " + bb);
		System.out.println("a = " + a + " b = " + b);
		
		int i = 10;
		
		System.out.println(i++);
		//print(i) -> i++;
		System.out.println(++i);
		// ++i -> print(i);
		System.out.println(i);
		

	}

}
