package ch_08ex_01;

public interface Lenderable {

	public static final int BORROW = 1;
	int NORMAL = 0;
	//public static final <- 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있음
	public abstract void checkOut(String borrower, String date);
	void checkIn();
	//public abstract <- 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있음

}

class SeperateVolume implements Lenderable {
	String 	title;
	String 	date;
	String 	borrower;
	int		status;
	
	SeperateVolume(String title) {
		this.title = title;
	}
	
	public void checkOut(String borrower, String date) {
		if(status != NORMAL) {
			return;
		}
		this.date		= date;
		this.borrower	= borrower;
		status			= BORROW;
		//BORROW = 1; 안됨
	}
	
	@Override
	public void checkIn() {
		if(status != BORROW) {
			return;
		}
		System.out.println("Borrorwer " + borrower + " 이(가) " + title + "책을 반납했다");
		date 		= null;
		title 		= null;
		borrower 	= null;
		status 		= NORMAL;
	}
}
