package ch08_ex04;

public class Car {
	
	Tire frontLeftTire 	= new Tire("FL", 6);
	Tire frontRightTire = new Tire("FR", 2);
	Tire rearLeftTire 	= new Tire("RL", 3);
	Tire rearRightTire 	= new Tire("RR", 4);
	
	int run() {
		System.out.println("\n-----------------------------\nThe car is driving on the road");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(rearLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(rearRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("\n[[The car is stopped]]\n");
	}
		

}
