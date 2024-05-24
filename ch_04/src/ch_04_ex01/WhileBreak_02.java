package ch_04_ex01;

public class WhileBreak_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		while(true) {
			i++;
			while(true ) {
				j++;
				System.out.print("Present 'j' is " + j + "\t");
				if(j == 5) break;
			}
			System.out.println("\nPresent 'i' is " + i);
			j = 0;
			if(i == 10) break;
		}
		
		System.out.println("The END");

	}

}
