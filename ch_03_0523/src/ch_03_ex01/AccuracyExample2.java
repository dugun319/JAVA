package ch_03_ex01;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		int totalPiece = apple * 10;
		int number = 7;
		
		int temp = totalPiece - number;
		
		double result = temp / 10.0;
		
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다");

	}

}
