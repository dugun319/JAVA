package ch08_ex07;

public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");

	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the TV");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("The present volume of TV : " + this.volume);

	}

}
