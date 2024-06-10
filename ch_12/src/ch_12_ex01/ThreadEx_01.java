package ch_12_ex01;

//Rule1
//Thread 생성시 반드시 extends Thread
class A1 extends Thread {
	public A1(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.print(getName() + i + "\t");
			if(i%10 == 0) {
				System.out.println();
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				//
			}
		}
		super.run();
	}

}

public class ThreadEx_01 {
	public static void main(String[] args) throws InterruptedException {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		
		a1.start();
		a2.start();
		
//		a1.run();
//		a2.run();
		
		for(int i = 1 ; i<=100 ; i++) {
			System.out.print("Main " + i + "\t");
			if(i%10 == 0) {
//				a1.sleep(500);
//				a2.sleep(500);
				System.out.println();
			}
		}
	}
}
