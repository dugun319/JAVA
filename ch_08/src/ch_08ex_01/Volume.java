package ch_08ex_01;

public interface Volume {
	void volumeUp();
	void volumeDown();
	public abstract void play();
}

class TV implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Increase the volume of TV");		
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease the volume of TV");	
	}
	
	public void play() {
		System.out.println("Watch TV!");		
	}
	
}

class Audio implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Increase the volume of Audio");	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease the volume of Audio");	}
	
	public void play() {
		System.out.println("Listen to the audio");				
	}
	
}

class Speaker implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Increase the volume of Speaker");		
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease the volume of Speaker");				
	}
	
	public void play() {
		System.out.println("Hear through the speaker");
	}
	
}