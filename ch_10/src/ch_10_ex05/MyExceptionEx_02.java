package ch_10_ex05;

public class MyExceptionEx_02 {

	public static void main(String[] args) {
		//BIZ rule
		//MIN salary :	1,000,000
		//MAX salary : 10,000,000
		
		System.out.println("Java MyExceptionEx02 num");
		
		
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(num);
			if(num < 1000000) {
				throw new MyException02_01();
			} else if (num > 10000000) {
				throw new MyException02_02();
			} else {
				System.out.println("Normal operation");
			}

		} catch (MyException02_01 e) {
			System.out.println(e.getMessage());
		} catch (MyException02_02 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Wrong operation");
			System.out.println("How to Use");
			System.out.println("JAVA MyExceptionEx_02 num");
		}
	}

}
