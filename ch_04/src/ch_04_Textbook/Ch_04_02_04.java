package ch_04_Textbook;

public class Ch_04_02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 10 ; i++) {
			for(int j = 0 ; j <= 10 ; j++) {
				if(((i * 4) + (j * 5)) == 60) {
					System.out.println("( " + i + " , " + j + " )");
				}
			}
		}

	}

}
