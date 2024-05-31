package ch_08ex_01;

class C11 {
	C11() {
		System.out.println("paremeter 없는 super 생성자");
	}
	
	C11(String str) {
		System.out.println("paremeter 있는 부모 생성자 1EA str " + str);
	}
	
	void cM1() {
		System.out.println("In cM_ONE, today is Thursday!");
	}
}

class C22 extends C11 {
	C22() {
		super("Call"); //paremeter 없는 부모 생성자 call
		System.out.println("paremeter 없는 this 생성자");
	}
	
	void cM1() {
		System.out.println("In cM_TWO, today is Thursday!");
		}
	
	void cM2() {
		System.out.println("In cM_TWO, this is this method cM2()");
		}
}


public class Super02 {

	public static void main(String[] args) {

		C22 c = new C22();
		c.cM2();
		c.cM1();
	}

}
