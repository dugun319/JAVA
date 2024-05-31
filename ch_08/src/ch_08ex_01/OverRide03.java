package ch_08ex_01;

abstract class C1 {
	int k;
	public C1() {
		System.out.println("Abstract class constructor");
	}
	void setK(int k) {
		this.k = k;
	}
	
	abstract void print();
	//abstract class 는 하나 이상의 abstract method 가 존재해야 함.
	
}

class C2 extends C1 {

	@Override
	void print() {
		System.out.println("C2 -> " + k);
		
	}
	
	void print2() {
		System.out.println("C2.print2()");
	}
	
}

public class OverRide03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C1 c1 = new C1();
		//Cannot instantiate the type C1 <- 하나 이상의 abstract method 가 존재 
		
		C1 c1 = new C2();
		
		c1.setK(7);
		c1.print();
		//c1.print2(); <- The method print2() is undefined for the type C1 
		
		C2 c2 = new C2();
		c2.setK(12);
		c2.print();
		c2.print2();
		
	}

}
