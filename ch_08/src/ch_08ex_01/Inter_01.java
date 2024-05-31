package ch_08ex_01;

public interface Inter_01 {
	public static final int AA = 3;
	int AB = 5;
	//public static final 생략
	public abstract void display();
	void print();
	//public abstract 생략
}

class D1 implements Inter_01 {

	@Override
	public void display() {
		//AA 변경이 불가, 상수이기 때문 public static final
		System.out.println("재정의 완료 AA -> " + AA);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Interface Inter_01");
		
	}
	
}

