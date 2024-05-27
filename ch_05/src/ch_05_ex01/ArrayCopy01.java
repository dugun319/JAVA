package ch_05_ex01;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   index  0  1  2  3  4  5  6
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = new int [10];
		
//		for(int i = 0 ; i < a.length ; i++) {
//			b[i] = a[i];
//		}
		
		System.out.println("\n--------------a, 0, b, 0, a.length-----------");
		
		//a 배열 index 0을 b 배열 index 0으로 copy
		//(Object src, int srcPos, Object dest, int destPos, int length)
		//범위를 벗어나면 error length
		System.arraycopy(a, 0, b, 0, a.length);
		//System.out.println("b -> " + b);
		print_method(b);
		cls_method(b);
		print_method(b);
		
		System.out.println("\n--------------a, 0, b, 1, a.length-----------");		
		System.arraycopy(a, 0, b, 1, a.length);
		print_method(b);
		cls_method(b);
		print_method(b);
		
		System.out.println("\n--------------a, 0, b, 2, a.length-----------");		
		System.arraycopy(a, 0, b, 2, a.length);
		print_method(b);
		cls_method(b);
		print_method(b);
		
		System.out.println("\n--------------a, 0, b, 3, a.length-----------");		
		System.arraycopy(a, 0, b, 3, a.length);
		print_method(b);
		cls_method(b);
		print_method(b);
		
		System.out.println("\n--------------a, 1, b, 0, a.length-1---------");
		System.arraycopy(a, 1, b, 0, a.length-1);
		print_method(b);
		cls_method(b);
		print_method(b);
		
		System.out.println("\n--------------a, 1, b, 3, a.length-1---------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		print_method(b);
		cls_method(b);
		print_method(b);


	}
	
	//모듈(Module)과 모듈화(Modularization)

	private static void cls_method(int[] tArray) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < tArray.length ; i++) {
			tArray[i] = 0;
		}
		
	}

	private static void print_method(int[] tArray) {
		for(int i = 0 ; i < tArray.length ; i++) {
			System.out.printf("%d\t", tArray[i]);
		}
		System.out.println();
		
		
	}

}
