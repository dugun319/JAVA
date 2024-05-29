package ch_04_ex02;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		
			case 'A' :
			case 'a' :
				System.out.println("You are a VVIP member");
				break;
			case 'B' :
			case 'b' :
				System.out.println("You are a VIP member");
				break;
			default :
				System.out.println("You are a guest");
		}

	}

}
