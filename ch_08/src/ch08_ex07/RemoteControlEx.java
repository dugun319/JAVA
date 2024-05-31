package ch08_ex07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc.setVolume(7);
		rc.setVolume(17);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		

	}

}
