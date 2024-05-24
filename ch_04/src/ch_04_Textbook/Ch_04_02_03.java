package ch_04_Textbook;

public class Ch_04_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		boolean flag = true;
		
		while(flag) {
			num1 = (int) ((Math.random() * 6 + 1));
			num2 = (int) ((Math.random() * 6 + 1));
			if(num1 + num2 == 5) {
				flag = false;
				System.out.println("( " + num1 + " , " + num2 + " )");
				System.out.println("Dice program will be closed.");
			} else {
				System.out.println("( " + num1 + " , " + num2 + " )");
			}
		}

	}

}
