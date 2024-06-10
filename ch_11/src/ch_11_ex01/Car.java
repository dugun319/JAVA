package ch_11_ex01;

public class Car {
	void print() {
		System.out.println("I'm the Car Class");
	}
}

class Bus extends Car {
	void print() {
		System.out.println("I'm the Bus Class");
	}
	void move() {
		System.out.println("I can transport 50 passengers at once");
	}
}

class Taxi extends Car {
	void print() {
		System.out.println("I'm the Taxi Class");
	}
	
}