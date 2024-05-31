package ch08_ex03;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("Power on");
	}
	
	void powerOff() {
		System.out.println("Power off");
	}

	
	void bell() {
		System.out.println("Bell is ringing");
	}

	
	void sendVoice(String message) {
		System.out.println("Me : " + message);
	}
	
	void recieveVoice(String message) {
		System.out.println("The other person : " + message);
	}

	void hangUp() {
		System.out.println("The call is ending");
	}


}
