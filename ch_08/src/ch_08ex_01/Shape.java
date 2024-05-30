package ch_08ex_01;

public abstract class Shape {
	int a = 3;
	abstract void darw();
	void print() {
		System.out.println("-----선과 점으로 구성-----");
	}

}

class Rectangle extends Shape {

	@Override
	void darw() {
		System.out.println("Draw a Recntangle");
	}
	
	public void display() {
		System.out.println("┌─┐");
		System.out.println("└─┘");
	}
	
}

class Triangle extends Shape {

	@Override
	void darw() {
		System.out.println("Draw a Triangle");
	}
	
	public void display() {
		System.out.println("△");
	}

}

class Circle extends Shape {

	@Override
	void darw() {
		System.out.println("Draw a Triangle");
	}
	
	public void display() {
		System.out.println("○");
	}

}

