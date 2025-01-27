package ch_10_ex03;

public class ExceptionEx_02 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(!b) {
				System.exit(0); //finally도 무시!!
			}
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		System.out.println("\n\nMethod(true) is called");
		method(true);
		
		System.out.println("\n\nMethod(false) is called");
		method(false);	

	}

}
