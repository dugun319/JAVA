package ch03_ex01;

public class AccuracyEx2 {

	public static void main(String[] args) {
		int    apple       = 1;
		int    totalPieces = apple * 10;
		int    number = 7;
		
		int temp = totalPieces - number;
		
		// 우선순위 같을시, 왼쪽->오른쪽으로 진행
		// 우선순위 * / % -> + -
		double result = temp/10.0; 
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
	}

}
