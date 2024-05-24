package ch04_ex01;

public class If02 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a->"+a);
		System.out.println("b->"+b);
		
		if ( a > 0 ) {
			System.out.println(a+"는 양수");
			System.out.println("양수일");
		} else {
			System.out.println(a+"는 음수");
			System.out.println("음수일");
		}
		
		System.out.println("프로그램 종료");  
		
	}

}
