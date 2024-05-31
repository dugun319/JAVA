package ch_08ex_02;

public class Car {
	
	String kind;
	Engine eg;
	public Car(String kind, Engine eg) {
		
		this.kind 	= kind;
		this.eg 	= eg;
		
	}
	
	void print() {
		System.out.println("Kind : " + kind);
		eg.print();
		System.out.println("========================");
	}

	public static void main(String[] args) {
		Engine eg1 = new Engine("Alpha", 1600);
		Engine eg2 = new Engine("Beta", 3000);
		
		Car [] c = new Car[3];
		c[0] = new Car("Sonata", eg1);
		c[1] = new Car("Avante", eg1);
		c[2] = new Car("Benz", eg2);
		
		for(Car tempC : c) {
			tempC.print();
		}
		
		for(int i = 0 ; i < c.length ; i++) {
			c[i].print();
		}
		
	}

}
