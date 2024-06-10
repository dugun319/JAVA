package ch_12_ex03;

class Account_02_User extends Thread {
	Account_02 act;
	boolean flag;
	
	public Account_02_User(Account_02 act, String name) {
		super(name);
		this.act = act;
		
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} synchronized (act) {
				if(flag) {
					act.deposit((int)(Math.random()*10000),  getName());
				} else {
					act.withdraw((int)(Math.random()*10000), getName());
				}
				flag = !flag;
			}
		}
	}
}

public class Account_02Ex {

	public static void main(String[] args) {
		Account_02 act1 = new Account_02(10000);
		Account_02 act2 = new Account_02(15000);
		
		//하나의 account 를 3명이 공동으로 사용 
		Account_02_User au1 = new Account_02_User(act1, "민지");
		Account_02_User au2 = new Account_02_User(act1, "하니");
		Account_02_User au3 = new Account_02_User(act1, "해린");
		
		//하나의 account 를 3명이 공동으로 사용 
		Account_02_User au4 = new Account_02_User(act2, "지민");
		Account_02_User au5 = new Account_02_User(act2, "슈가");
		Account_02_User au6 = new Account_02_User(act2, "정국");
		
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();

	}

}
