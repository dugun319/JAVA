package ch_06_ex01;

public class Car3 {
	String name;
	int inTime;
	int outTime;
	int fee;
	final int AMTPERTIME = 3_000;
	
	
	//기본생성자는 memory 확보
	public Car3() {
		// TODO Auto-generated method stub

	}
	
	
	//constructor 생성자
	//memory 초기화 및 변수 초기화
	public Car3(String n, int inTime, int out) {
		this.name = n;
		this.inTime = inTime;
		this.outTime = out;
	}
	
	void print() {
		int fee = (outTime - inTime) * AMTPERTIME;
		System.out.println("차량이름 : " + name);
		System.out.println("입고시간 : " + inTime);
		System.out.println("출고시간 : " + outTime);
		System.out.println("주차요금 : " + fee);
		System.out.println("---------------------");
	}

}
