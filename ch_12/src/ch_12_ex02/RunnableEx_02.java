package ch_12_ex02;

class Th1 extends Thread {
	Th1(String str) {
		super(str);
	}
	
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.print("Wow" + i + "\t");
			if(i%5 == 0) {
				System.out.println();
			}
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
}

class Th2 extends Thread {
	Th2(String str) {
		super(str);
	}

	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.print("Monday" + i + "\t");
			if(i%5 == 0) {
				System.out.println();
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}

class Ra3 implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(i + "\tTuesday\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
}

class Ra4 implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(i + "\tWednesday\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

		


public class RunnableEx_02 {

	public static void main(String[] args) {
		Th1 th1 = new Th1("Th1");
		Th2 th2 = new Th2("Th2");
		
		Ra3 r3 = new Ra3();
		Ra4 r4 = new Ra4();
		
		Thread th3 = new Thread(r3, "Ra3");
		Thread th4 = new Thread(r4, "Ra4");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}

}
