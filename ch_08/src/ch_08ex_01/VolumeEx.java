package ch_08ex_01;

public class VolumeEx {

	public static void main(String[] args) {
		Volume [] vol = new Volume[3];
		vol[0] = new TV();
		vol[1] = new Audio();
		vol[2] = new Speaker();
		
		for(Volume tempVol : vol) {
			tempVol.volumeUp();
			tempVol.volumeDown();
			
			if(tempVol instanceof TV) {
				((TV) tempVol).play();
			}
			
		}
	}

}
