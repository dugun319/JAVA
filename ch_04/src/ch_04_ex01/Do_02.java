package ch_04_ex01;

public class Do_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 Do2");

		int i = 1;
		int j = 2;

		do {
			do {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
				j++;
			} while(j <= 9);

			System.out.println();
			i++;
			j = 2;

		} while(i <= 9);
	}

}
