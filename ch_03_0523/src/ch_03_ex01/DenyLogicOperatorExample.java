package ch_03_ex01;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play = true;
		System.out.println("play 초기값   -> " + play);
		
		play = !play;
		System.out.println("play 두번째 값 -> " + play);

		play = !play;
		System.out.println("play 세번째 값 -> " + play);
	}

}
