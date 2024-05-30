package ch_08ex_01;

class A1 {
	private int superNum;
	public void print() {
		System.out.println("I'm a super class");
	}
	public int getSuperNum() {
		return this.superNum;
	}
	public void setSuperNum(int superNum) {
		this.superNum = superNum;
	}
	
}

class A2 extends A1 {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	public void print2() {
		System.out.println("I'm a A2 class");
	}
}


public class OverRide01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 egA1 = new A1();
		egA1.print();
		
		A1 egA2 = new A2();
		//super class로 선언은 가능하지만, this class의 method는 사용 불가능
		egA2.print();
		//egA2.print3();
		//compile error
		
		A2 egA3 = new A2();
		egA3.print2();
		//egA3.superNum
		//-> super class 의 private 변수는 접근이 불가능
		
		//A2 egA4 = new A1();
		//-> compile error
		//this class로 선언 자체가 불가능하다

	}

}
