package ch_04_ex01;

public class While_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 1;
		
		while(num1 <= 9) {
			while(num2 <= 9) {
				System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
				num2++;
			}
			System.out.println();
			num1++;
			num2 = 1;
		}
		
		num1 = 2;
		num2 = 1;
		
		while(num2 <= 9) {
			while(num1 <= 9) {
				System.out.print(num1 + " X " + num2 + " = " + (num1 * num2) + "\t");
				num1++;
			}
			System.out.println();
			num1 = 2;
			num2++;
		}

	}

}
