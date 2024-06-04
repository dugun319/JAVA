package ch_10_ex05;

public class MyExceptionEx_03 {

	public static void main(String[] args) throws MyException02_03 {
		//BIZ rule
		//MIN salary :	1,000,000
		//MAX salary : 10,000,000

		System.out.println("Java MyExceptionEx02 num");
		int num = 0;
		

		if(!(args.length > 0)) {
			throw new MyException02_03();
		} else {
			num = Integer.parseInt(args[0]);
		}

		try {
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
		}

	}

}
