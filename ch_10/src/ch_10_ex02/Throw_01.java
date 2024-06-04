package ch_10_ex02;

import java.io.IOException;

public class Throw_01 {

	public static void main(String[] args) {
		System.out.println("Hello");
		Exception e1 = new Exception("I made an error");
		
		try {
			System.out.println("e1 1");
			throw e1;
			//System.out.println("This phrase could not be printed");
		} catch (IOException e2) {
			System.out.println(e2.getMessage() + " IOE");
		} catch (Exception e3) {
			System.out.println(e3.getMessage() + " kkk");
		} 
		
		System.out.println("The program is ended normally");
	}

}
