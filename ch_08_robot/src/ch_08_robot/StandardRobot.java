package ch_08_robot;

import ch_08_robot.actions.FireOk;
import ch_08_robot.actions.FlyNo;
import ch_08_robot.actions.KnifeWooden;

public class StandardRobot extends Robot {
	
	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWooden();
	}
	

	@Override
	public void shape() {
		System.out.println("I have head, arms, legs and body. And I can run and walk");

	}

}
