package ch_12_ex01;

class Th3 extends Thread {
	Th3(String str) {
		super(str);
	}
	
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(getName() + " Wow " + i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class Th4 extends Thread {
	Th4(String str) {
		super(str);
	}
	
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(getName() + " Monday " + i);
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadEx_04HW {

	public static void main(String[] args) {
		// 20회 thread 수행
		// th3 -> 10ms
		// th4 -> 20ms
		
		Th3 t3 = new Th3("Th3 Thread");
		Th4 t4 = new Th4("Th4 Thread");

		t3.start();
		t4.start();
	}

}
