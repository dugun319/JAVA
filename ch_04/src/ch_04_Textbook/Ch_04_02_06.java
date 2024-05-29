package ch_04_Textbook;

public class Ch_04_02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 0 ; i < 4 ; i++) {
			
			for(int j = 4 ; j > 0 ; j--) {
				
				if(j - 1 > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			
			for(int j = 0 ; j < 4-i ; j ++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j ++) {
				System.out.print("*");
			}
			System.out.println();
			
		}*/
		
		for(int i = 0 ; i < 4 ; i++) {

			for(int j = 8 ; j + i > 0 ; j--) {

				if(j - 1 > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
		
		for(int i = 2 ; i < 6 ; i++) {

			for(int j = 8 ; j + i > 0 ; j--) {

				if(j - 1 > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
		for(int i = 3 ; i < 8 ; i++) {

			for(int j = 8 ; j + i > 0 ; j--) {

				if(j - 1 > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
		for(int i = 0 ; i < 4 ; i++) {

			for(int j = 0 ; j < 7 ; j++) {

				if(j < 6) {
					System.out.print(" ");
				} else {
					System.out.print("|||");
				}
			}
			System.out.println();

		}

	}

}
