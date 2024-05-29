package ch_03_ex01;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode1 = 'A';
		int charCode2 = 'a';
		int charCode3 = '3';
		int charCode4 = 6;
		int charCode5 = '6';
		
		
		
		
		//& 와 &&는 모두 여러 개의 조건식을 하나로 연결하는 AND 연산자
		//공통점: 모두 true 일때만 true 를 반환하며, &와 &&는 같은 결과를 도출
		//차이점
		//&  는 앞의 조건식이 false 여도 뒤의 조건식을 연산
		//&& 는 앞의 조건식이 false 이면 뒤의 조건식을 연산하지 않음
		
		if((charCode1 >= 65) & (charCode1 <= 90)) {
			System.out.println(charCode1 + " is capial(uppercase) letter.");
		} 
		
		if((charCode2 >= 97) && (charCode2 <= 122)) {
			System.out.println(charCode2 + " is lowercase letter.");
		} 
		
		if((charCode3 > 48) && (charCode3 < 57)) {
			System.out.println((char)charCode3 + " is the number between 0 to 9.");
		}
		
		
		if((charCode4%2 == 0) | (charCode4%3 == 0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
		
		//ASCII로 연산
		//54를 2로 나누거나 3으로 나눈 값을 반환
		if((charCode5%2 == 0) | (charCode5%3 == 0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
		
	}

}
