package ch_02_ex02;

public class IncreaseDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		int result1 = num1++;
		//result1에 num1을 할당 후 ++연산
		
		int result2 = num2--;
		//result2에 num2를 할당 후 --연산
		
		int result3 = ++num3;
		//result3에 ++연산 수행한 num3을 할당
		
		int result4 = --num4;
		//result4에 --연산 수행한 num4를 할당
		
		
		
		System.out.println("result1 -> " + result1);
		System.out.println("result2 -> " + result2);
		System.out.println("result3 -> " + result3);
		System.out.println("result4 -> " + result4);
		
		int result5 = ++result3;
		//result5에 ++연간을 수행한 result3를 할당
		System.out.println("result5 -> " + result5);
		
		result3--;
		//선언이나 할당하지 않을 때는 증감 연산자의 위치는 무관함
		
		int result6 = result3;
		System.out.println("result6 -> " + result6++);
		
		result3 = result6;
		System.out.println("result3 -> " + result3);

	}

}
