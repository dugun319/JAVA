package ch_05_ex01;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"산토끼", "고양이", "달토끼", "강아지"};
		
		for(int i = 0 ; i < str.length ; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		
		for(String j : str) {
			System.out.printf("%s\t", j);
		}

	}

}
