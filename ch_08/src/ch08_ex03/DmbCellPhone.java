package ch08_ex03;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model		= model;
		this.color		= color;
		this.channel 	= channel;
	}
	
	public void trunOnDmb() {
		System.out.println("DMB Power on");
		System.out.printf("DMB is started on channel %d\n", this.channel);
	}

	public void turnOffDmb() {
		System.out.println("DMB Power off");
	}

	public void changChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("The channel is changed to channel %d\n", this.channel);
	}

}
