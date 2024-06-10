package ch_12_ex02;

class Ra1 implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(i + "\tWOW\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
}

class Ra2 implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(i + "\tMonday\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class RunnableEx_01 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		
		// implements 는 Thread로 선언 한 후에 사용
		Thread th1 = new Thread(r1, "Primary");
		Thread th2 = new Thread(r2, "2nd");
		
		th1.start();
		th2.start();

	}

}
