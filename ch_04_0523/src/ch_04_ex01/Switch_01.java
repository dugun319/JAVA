package ch_04_ex01;

public class Switch_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		for(int i=0 ; i<5 ; i++) {

			num = Integer.parseInt(args[i]);

			switch(num) {
			case 1  : System.out.println("L"); break;
			case 2  : System.out.println("O"); break;
			case 3  : System.out.println("V"); break;
			case 4  : System.out.println("E"); break;
			default : System.out.println("똑바로합시다!");
			}
			//break가 없으면 이후 모든 조건을 실행함.

		}

	}

}
