package ch_12_ex01;

class Th1 extends Thread {
//	Th1(String str) {
//		super(str);
//	}
	
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.print("Wow" + i + "\t");
			if(i%5 == 0) {
				System.out.println();
			}
			try {
				sleep(150);
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
			System.out.println(getName() + i + "\t");
			// System.out.print("Wednesday" + i + "\t");
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

public class ThreadEx_03 {
	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2("2ndThread");
		
		t1.start();
		t2.start();
		
	}

}
