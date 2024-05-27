package ch_05_ex01;

public class Array02 {

	public static void main(String[] args) {


		int[] a1 = new int[] {9, 56, 123, 8, 4};
		int[] a2 = {9, 56, 123, 8, 4};
		int a3[] = new int[] {9, 56, 123, 8, 4};
		int a4[] = {9, 56, 123, 8, 4};

		System.out.println("a1.length = " + a1.length);

		for(int i = 0 ; i < a1.length ; i++) {
			//System.out.print("a1[" + i + "] = " + a1[i] + "\t");
			System.out.printf("a1[%d] = %d\t", i, a1[i]);
		}
		System.out.println();
		
		//실무에서 더 많이 사용하는 for loop
		for(int j : a2) {
			System.out.println("j -> " + j );
		}
		
		for(int j : a3) {
			System.out.println("j -> " + j );
		}
		
		for(int j : a4) {
			System.out.println("j -> " + j );
		}

	}

}
