package ch_08ex_02;

public class Engine {
	
	String type;
	int cc;
	
	Engine(String type, int cc) {
		this.type 	= type;
		this.cc 	= cc;
	}
	
	void print() {
		System.out.printf("Type\t\t: %s\n", type);
		System.out.printf("Displacement\t: %d\n", cc);
	}

}
