package ch_08_robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("I'm placing an order of SuperRobot");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		
		System.out.println("\n======================================");
		System.out.println("I'm placing an order of StandardRobot");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		
		System.out.println("\n======================================");
		System.out.println("I'm placing an order of CheapRobot");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
	}

}
