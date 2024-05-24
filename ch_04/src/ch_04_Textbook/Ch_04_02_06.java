package ch_04_Textbook;

public class Ch_04_02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4-i ; j ++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
