package ch02_ex03;

public class Variable05 {

	public static void main(String[] args) {
		 int n1 = 90;
		 int n2 = 90;
		 int n3 = 91;
		 int sum;
		 double avg1;
		 double avg2;
		 double avg3;
		 double avg4;
		 
		 sum = n1 + n2 + n3;
		 avg1 =    sum /   3;
		 avg2 =    sum / (float)  3;
		 avg3 =  (float) ( sum /  3 );  // 정수결과에 Float형을 선언 
		 avg4 =  (float) sum /  3;

		 System.out.printf("총점  = %d\n", sum );  // println
		 System.out.printf("평균1 = %.1f\n", avg1) ; 
		 System.out.printf("평균2 = %f\n", avg2) ; 
		 System.out.printf("평균3 = %.1f\n", avg3) ; 
		 System.out.printf("평균4 = %.1f\n", avg4) ; 

	}

}
