package ch_08ex_01;

class B1 {
	void print1() {
		System.out.println("바꾸기 가능");
	}
	
	final void print2() {
		System.out.println("변경 금지");
	}
}

class B2 extends B1 {
	@Override
	void print1() {
		// TODO Auto-generated method stub
		System.out.println("this is B2 class override method");
	}
	
//	void print2() {
//		 Cannot override the final method from B1
//	}
	
	void print3() {
		System.out.println("this is B2 class only method");
	}
}

public class OverRide02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 b1 = new B2();
		b1.print1();
		b1.print2();
		//b1.print3();
		//-> compile error -> super class로 선언은 가능하지만 B2 only는 사용 불가능

	}

}
