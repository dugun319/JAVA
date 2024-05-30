package ch_08ex_01;

public class RobotEx {
	
	static void action(Robot r) {
		//instanceof 객체의 비교. 같은 객체인지 다른 객체인지
		if(r instanceof DanceRobot) {
			((DanceRobot)r).dance();
			//(DanceRobot)r.dance(); -> r.dance를 (DanceRobot)으로 캐스팅한 구문
			
			//캐스팅 구문, 같은 type의 객체는 casting이 가능
		} else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		} else {
			//((SingRobot)r).sing();
			SingRobot sr = (SingRobot) r;
			//캐스팅 구문, 같은 type의 객체는 casting이 가능
			sr.sing();
		}
	}

	public static void main(String[] args) {
		Robot [] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		
		for(Robot r : rb) {
			action(r);
		}

	}

}
