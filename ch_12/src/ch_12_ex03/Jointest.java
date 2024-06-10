package ch_12_ex03;

import java.util.ArrayList;

class Before extends Thread {
	Before(String str) {
		super(str);
	}
	
	void addCar() {
		System.out.println("<< addCar >>");
		Jointest.carList.add("Benz");
		Jointest.carList.add("Audi");
		Jointest.carList.add("Porsche");
		Jointest.carList.add("Hyundai");
		System.out.println("Insert \"addCar\"");
	}
	
	@Override
	public void run() {
		System.out.println(getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("Call \"addCar\"");
		addCar();
		System.out.println("\"addCar\" is ended");
	}
}


class After extends Thread {
	After(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		System.out.println(getName());
		for(String tempCar : Jointest.carList) {
			System.out.println(tempCar);
		}
	}
}

public class Jointest {
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		
		Before bf = new Before("Class Before");
		After af = new After("Class After");
		
		bf.start();
		
		try {
			bf.join();	//Waits for this thread to die. 
			//An invocation of this method behaves 
			//in exactly the sameway as the invocation 

		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		af.start();

	}

}
