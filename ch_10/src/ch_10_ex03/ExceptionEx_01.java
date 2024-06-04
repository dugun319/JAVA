package ch_10_ex03;

public class ExceptionEx_01 {
	
	static void method(boolean b) {
		try {
			System.out.println(1 + "b -> " + b);
			if(b) {
				throw new ArithmeticException();
			}
			System.out.println(2); //예외가 발생되면 실행되지 않음
		//RuntimeException 은 ArithmeticException의 super class	
		} catch (RuntimeException r) {
			System.out.println("RuntimeException -> " +3);
			return;
			//finally 블럭을 수행 후 매서드를 나감
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			// 위에 return이 있어도 무조건 실행
			System.out.println("예외 여부에 관계 없이 항상 실행 -> " + 5);
		}
		
		System.out.println("정상적으로 끝나면 실행 -> " + 6);
	}

	public static void main(String[] args) {
		System.out.println("\n\nMethod(true) is called");
		method(true);
		
		System.out.println("\n\nMethod(false) is called");
		method(false);
		

	}

}
