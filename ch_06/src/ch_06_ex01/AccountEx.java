package ch_06_ex01;

class Account {
	String account;
	String name;
	private int balance;
	
	public Account() {
		System.out.println("무명계좌가 개설되었습니다. 이름과 계좌번호를 지정해주세요\n");
	}
	
	public Account(String acc, String n, int bal) {
		this.account = acc;
		this.name = n;
		this.balance = bal;
		
		System.out.printf("%s이(가) 계좌 [%s] 을(를) 개설하였습니다\n",
				this.name, this.account);
		this.prebalance();
	}
	
	void deposit(int amt) {
		if(amt < 0) {
			System.out.println("입금액을 잘못 입력하였습니다.");
		} else {
		this.balance += amt;
		System.out.printf("%s이(가) %d 원을 입금합니다\n", this.name, amt);
		this.prebalance();
		}
	}
	
	void withdraw(int amt) {
		if(amt > this.balance) {
			System.out.printf("%s의 잔고가 부족합니다\n", this.name);
			this.prebalance();
		} else {
			this.balance -= amt;
			System.out.printf("%s이(가) %d 원을 출금합니다\n", this.name, amt);
			this.prebalance();
		}
	}
	
	void prebalance() {
		System.out.println("현재 잔액은 " + this.balance + " 원 입니다\n");
	}
}

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account p1 = new Account();
		Account p2 = new Account("12344321", "Lee", 5_000);
		Account p3 = new Account("56788765", "Kang", 15_000);
		
		p1.account = "90900909";
		p1.name = "Kim";
		p1.deposit(10_000);
		
		p1.deposit(-500);
		p1.deposit(500);
		
		p2.withdraw(7500);
		p2.withdraw(2500);
		
		p3.deposit(50);
		p3.withdraw(10_000);
		
		
	}

}
