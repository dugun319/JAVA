package ch_08ex_02;

class D1 {
	D1() {
		System.out.println("매개변수 없는 super*2 생성자");
	}
	
	D1(int x) {
		//this();
		System.out.println("매개변수 1개인 super*2 생성자 x -> " + x);
	}
}

class D2 extends D1{
	D2(int x) {
		//super(x); -> 있든 없든 super 생성자는 무조건 실행
		//-> 없으면 기본생성자 실행
		//-> 있으면 지정된 super 생성자 실행
		System.out.println("매개변수 1개인 super 생성자 x -> " + x);
	}
	
	D2(int x, int y) {
		this(x);
		System.out.println("매개변수 2개인 super 생성자 x, y -> " + x + ", " + y);
	}
}

class C3 extends D2{
	C3(int x, int y) {
		super(x, y);
		System.out.println("매개변수 2개인 this 생성자 x, y -> " + x + ", " + y);
	}
	
	void c3() {
		System.out.println("this is this WOW!");
	}
}

public class Super03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 c = new C3(7, 15);
		System.out.println(c);
	}

}
