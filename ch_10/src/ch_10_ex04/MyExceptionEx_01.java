package ch_10_ex04;

public class MyExceptionEx_01 {

	public static void main(String[] args) {
		int num1 = 15;
		
		try {
			//BIZ rule
			if(num1 > 10) {
				throw new MyException();
			} 
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
