package ch_04_ex02;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8 <= ... < 12 (8+4) 사이의 정수 얻기
		
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시간 : " + time + " 시]");
		
//		switch(time)
//		8 -> 출근합니다
//		9 -> 회의를 합니다
//		10 -> 업무를 봅니다
//		나머지 -> 외근을 나갑니다
		
		switch(time) {
			case 8 : 
				System.out.println("출근을 합니다");
				//break;
			case 9 : 
				System.out.println("회의를 합니다");
				//break;
			case 10 : 
				System.out.println("업무를 봅니다");
				//break;
			default :
				System.out.println("외근을 나갑니다");
				//break;
		}
	}

}
