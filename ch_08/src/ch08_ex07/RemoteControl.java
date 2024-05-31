package ch08_ex07;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Mute the device");
		} else {
			System.out.println("Unmute the device");			
		}
	}
	
	static void changeBattery() {
		System.out.println("Change the battery");
	}

}
