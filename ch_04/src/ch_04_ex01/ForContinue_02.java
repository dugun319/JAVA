package ch_04_ex01;

public class ForContinue_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag;
		
		for(int i = 0 ; i <= 5 ; i++) {
			for(int j = 0 ; j <= 5 ; j++ ) {

				System.out.println("Current j is " + j);
				flag = j>2;
				System.out.println(flag);
				if(j>2) continue;
				System.out.println("Great!");

			}
			System.out.println("OOPS! Current i is " + i);
		}

	}

}
