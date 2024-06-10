package ch_12_ex03;

public class Account_02 {
	
	int total;
	
	Account_02(int total) {
		this.total = total;
	}
	
	void deposit(int amt, String name) {
		this.total += amt;
		System.out.println(name + " Deposit : " + amt);
		getTotal();
	}
	
	
	void withdraw(int amt, String name) {
		if(amt <= this.total ) {
			total -= amt;
			System.out.println(name + " Withdraw : " + amt);
			getTotal();
		} else {
			System.out.println(name + " has wanted to withdraw from one's account, but the balance is insufficient");
			getTotal();
		}
	}
	
	void getTotal() {
		System.out.println("Current Balance : " + this.total);
	}
	
}
