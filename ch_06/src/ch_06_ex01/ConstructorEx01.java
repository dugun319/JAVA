package ch_06_ex01;

class Sonata {
	int a;
	String str = "";
	
	public Sonata() {
		
		System.out.println("I am a basic constructor");

	}

	public Sonata(int a) {
		
		System.out.println("I am basic + int_before -> " + this.a);
		this.a = a;
		System.out.println("I am basic + int_after -> " + this.a);

	}
	
	public Sonata(long a) {
		this.a = (int) a;
		System.out.println("I am basic + int -> " + this.a);

	}

	public Sonata(String str) {
		this.str = str;
		System.out.println("I am basic + String -> " + this.str);

	}
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sonata c1 = new Sonata();
		Sonata c2 = new Sonata(4);
		Sonata c3 = new Sonata(1000000000000L);
		Sonata c4 = new Sonata("AirBag");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
