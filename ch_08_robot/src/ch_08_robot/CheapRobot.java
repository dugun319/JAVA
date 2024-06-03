package ch_08_robot;

import ch_08_robot.actions.FireNo;
import ch_08_robot.actions.FlyNo;
import ch_08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {

	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
	}
	
	@Override
	public void shape() {
		System.out.println("I have head, arms, legs and body. And I can walk");

	}

}
