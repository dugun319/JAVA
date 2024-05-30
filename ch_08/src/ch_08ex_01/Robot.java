package ch_08ex_01;

public interface Robot {

}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("Let's dance");
	}
}

class DrawRobot implements Robot {
	void draw() {
		System.out.println("Let's draw");
	}
}

class SingRobot implements Robot {
	void sing() {
		System.out.println("Let's sing");
	}
}
