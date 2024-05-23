package ch_03_ex01;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    apple = 1;
		double pieceUnit = 0.1;
		int    number = 7;
		
		double result = apple - number * pieceUnit;
//		연산의 우선순위
//		- 우선순위가 같은 시, 왼쪽에서 오른쪽 (→ 방향)으로 진행
//		- 우선순위가 높은 연산자를 먼저 수행(*, /, % → +, -)
		
		double deprivation = number * pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다");
		System.out.println("먹은 것은" + deprivation);
		
		
		
		

	}

}
