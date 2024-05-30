package ch_07ex_03;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int [] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("Result1 = " + result1);
		
		int [] values2 = {1, 2, 3, 4, 5};
		int result2 = myCom.sum2(values2);
		System.out.println("Result2 = " + result2);
		
		int result3 = myCom.sum1(new int [] {1, 2, 3, 4, 5, 6, 7});
		System.out.println("Result3 = " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5, 6, 7);
		System.out.println("Result4 = " + result4);
	}

}
