package ch_10_ex02;

public class Throw_02 {

	public static void main(String[] args) {
		int num		= 100;
		int result	= 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			//논리적인 오류는 system이 인지 못하기 때문에 개발자가 try-catch or throw 문으로 처리 
			int randNum = (int)(Math.random() * 10);
			result = num / randNum;
			System.out.println("Result : " + result);
		}

	}

}
