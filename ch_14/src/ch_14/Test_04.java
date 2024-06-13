package ch_14;

class K1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}

class K2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class Test_04 {

	public static void main(String[] args) {
		K1 k1 = new K1();
		Thread k2 = new Thread(new K2());
		// K2 k2 = new K2();
		// Thread th2 = new Thread(k2);
		
		k1.start();
		k2.start();
		//th2.start();

	}

}
