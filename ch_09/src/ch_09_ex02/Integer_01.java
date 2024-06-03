package ch_09_ex02;
//모두 문자열을 정수로 변환해주는 메소드
// Integer.parseInt()는 결과값을 기본 자료형(Primitive Type)인 int 로 반환
// Integer.valueOf()는 문자열의 값을 정수형으로 변환한 뒤 
   //참조 자료형(Reference Type)인 Integer 객체로 만들어서 반환

public class Integer_01 {

	public static void main(String[] args) {
		String str = "3";
		int num1		= Integer.parseInt(str);
		int num2		= Integer.parseInt("3");
		// int 형으로 반환
		Integer num3	= Integer.valueOf(str);
		Integer num4	= Integer.valueOf("3");
		
		System.out.println("num1 -> " + num1);
		System.out.println("num2 -> " + num2);
		System.out.println("num3 -> " + num3);
		System.out.println("num4 -> " + num4);
		
		System.out.println(num1 + num2);
		System.out.println(num2 + num3);
		System.out.println(num3 + num4);
		
	}

}
