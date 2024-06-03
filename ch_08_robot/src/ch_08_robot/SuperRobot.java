package ch_08_robot;

import ch_08_robot.actions.FireOk;
import ch_08_robot.actions.FlyOk;
import ch_08_robot.actions.KnifeLaser;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
		flyAction  = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeLaser();
	}

	@Override
	public void shape() {
		System.out.println("I have head, arms, legs and body. And I can fly, run and walk");

	}

}
