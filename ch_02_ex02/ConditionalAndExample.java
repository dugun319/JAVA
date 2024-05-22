package ch_02_ex02;

public class ConditionalAndExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		
		if(++num1 > 0 && ++num2 > 0) {
			System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
		} else {
			System.out.println("num1이 0보다 크지 않거나 num2가 0보다 크지 않습니다.");
		}
		
		System.out.println("num1 -> " + num1);
		System.out.println("num2 -> " + num2);
		System.out.println();
		
		int num3 = 0;
		int num4 = 0;
		
		if(num3++ > 0 && ++num4 > 0) {
			System.out.println("num3이 0보다 크고 num4가 0보다 큽니다.");
		} else {
			System.out.println("num3이 0보다 크지 않거나 num4가 0보다 크지 않습니다.");
		}
		
		System.out.println("num3 -> " + num3);
		System.out.println("num4 -> " + num4);
		
		int num5 = 0;
		int num6 = 0;
		
		if(num5++ > 0 || ++num6 > 0) {
			System.out.println("num5이 0보다 크거나 num6이 0보다 큽니다.");
		} else {
			System.out.println("num5이 0보다 크지 않거나 num6가 0보다 크지 않습니다.");
		}
		
		System.out.println("num5 -> " + num5);
		System.out.println("num6 -> " + num6);
	}
	

}
