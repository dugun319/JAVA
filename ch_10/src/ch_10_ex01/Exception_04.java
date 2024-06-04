package ch_10_ex01;

public class Exception_04 {
	
	static void method_01() throws Exception {
		System.out.println("Method_01 is running");
		method_02();
	}

	static void method_02() throws Exception {
		System.out.println("Method_02 is running");
		throw new Exception();
	}

	public static void main(String[] args) throws Exception {
		method_01();
		System.out.println("Main method is ended");
	}

}
