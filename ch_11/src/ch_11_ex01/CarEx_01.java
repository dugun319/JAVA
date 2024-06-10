package ch_11_ex01;

import java.util.ArrayList;

public class CarEx_01 {

	public static void main(String[] args) {
		ArrayList<Car> aList = new ArrayList<Car>();
		aList.add(new Car());
		aList.add(new Bus());
		aList.add(new Taxi());
		
		for(Car tempC : aList) {
			tempC.print();
			if(tempC instanceof Bus) {
				((Bus)tempC).move();
			}
			//Bus b = (Bus) tempC;
			//b.move();
		}
		

	}

}
