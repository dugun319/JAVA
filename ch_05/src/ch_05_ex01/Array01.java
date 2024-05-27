package ch_05_ex01;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =  new int[5];
//		a[0] = 7;
//		a[1] = 34;
//		a[2] = 67;
//		a[3] = 6;
//		a[4] = 234;
		
		int[] b = {9, 56, 123, 8, 4};
		
		System.out.println("a.length = " + a.length);
		
		for(int i = 0 ; i < a.length ; i++) {
			//System.out.print("a[" + i + "] = " + a[i] + "\t");
			System.out.printf("a[%d] = %d\t", i, a[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i < b.length ; i++) {
			System.out.print("b[" + i + "] = " + b[i] + "\t");
		}
		
	}

}
