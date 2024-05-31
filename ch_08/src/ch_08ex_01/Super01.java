package ch_08ex_01;

class SS1 {
	SS1() {
		System.out.println("SS1 is constructed");
	}
}

class SS2 extends SS1 {
	SS2() {
		System.out.println("SS2 is constructed");
	}
}

class SS3 extends SS2 {
	SS3() {
		System.out.println("SS3 is constructed");
	}
}

class SS4 extends SS3 {
	SS4() {
		System.out.println("SS4 is constructed");
	}
}

class S1 {
	int a = 7;
	int b = 7;
	
	void display() {
		System.out.println("B1 Deabak");
	}
	
	void print() {
		System.out.println("B1 I'm super, print method");
	}
}

class S2 extends S1 {
	int a = 10;
	void print() {
		super.print();
		System.out.println("B2 member of super  a = " + super.a);
		System.out.println("B2 this method      a = " + this.a);
		System.out.println("B2 this method      b = " + b);
		System.out.println("===========================");
		
	}
}

public class Super01 {
	public static void main(String[] args) {
		S2 b = new S2();
		b.print();
		b.display();
		
		SS4 tempSS = new SS4();
		
		tempSS.hashCode();
		
	}
}
