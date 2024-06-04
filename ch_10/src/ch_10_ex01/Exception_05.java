package ch_10_ex01;

public class Exception_05 {
	
	static void method_01() throws Exception {
		try {
			System.out.println("Method_01 is running");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception is handled in Mehtod_01");
			throw e;
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Main method is started");
		try {
			method_01();
		} catch (Exception e) {
			System.out.println("Exception is handled in main mehtod");
		}
	}

}
