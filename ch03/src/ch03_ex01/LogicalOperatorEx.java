package ch03_ex01;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int charCode1 = 'A';		
		int charCode2 = 'a';		
		int charCode3 = '3';		
		int charCode6 = 7;		
		int charCode7 = 0;		

		// &와 && 는 여러개의 조건식을 하나로 연결하는 AND 연산자
		// 공통 : 모두 true 일때만 true 를 반환하며, &와 &&는 같은 결과를 도출
		// 차이 : & 는 앞의 조건식이 false 여도 뒤의 조건식이 true인지 false 인지 판별
		//       && 는 앞의 조건식이 false 라면, 뒤의 조건식은 true인지 false인지 신경쓰지 X   
		if( (charCode1>=65) & (charCode1<=90) ) {
			System.out.println(charCode1+"대문자 이군요");
		}

		if( (charCode2>=97) && (charCode2<=122) ) {
			System.out.println(charCode2+"소문자 이군요");
		}

		if( !(charCode3<48) && !(charCode3>57) ) {
			System.out.println("0~9 숫자 이군요");
		}

		System.out.printf("1. charCode6 %c \n", charCode6);
		System.out.printf("2. charCode6 %d \n", charCode6);
		//          ASCII Code 연산 
		// charCode7 = charCode6%5;
		// ystem.out.printf("3. charCode7 %d \n", charCode7);
		
		if( (charCode6%2==0) | (charCode6%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		} else {
			System.out.println("2 또는 3의 배수 아니군요");
		}
	}

}
