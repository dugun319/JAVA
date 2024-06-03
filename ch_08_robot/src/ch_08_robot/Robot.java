package ch_08_robot;

import ch_08_robot.actions.FireAction;
import ch_08_robot.actions.FlyAction;
import ch_08_robot.actions.KnifeAction;

public abstract class Robot {
	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {
	}
	
	public abstract void shape();
	
	//robot class 가 아닌, super class에서 수정을 할 수 있어야 프로그램의 유연성이 증가
	public void actionFly() {
		flyAction.fly();
	}
	
	public void actionFire() {
		fireAction.fire();
	}
	
	public void actionKnife() {
		knifeAction.knife();
	}
	
	public void actionBasic() {
		System.out.println("The robot should have his own head, arms, legs and body");
	}
	
	//필요할 때는 setter만 선언
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}

//	public void setKnifeAction(KnifeAction knifeAction) {
//		this.knifeAction = knifeAction;
//	}
//	

}
