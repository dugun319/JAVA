package ch_02_ex03;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 90;
		int n2 = 90;
		int n3 = 91;
		int sum;
		
		double avg1;
		double avg2;
		double avg3;
		double avg4;
		
		sum = n1 + n2 + n3;
		avg1 = sum / 3;
		avg2 = sum / (float) 3;
		avg3 = (float) sum / 3;
		avg4 = (float) (sum / 3);
		
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균1 = %.4f\n", avg1);
		System.out.printf("평균2 = %f\n", avg2);
		System.out.printf("평균3 = %f\n", avg3);
		System.out.printf("평균4 = %.4f\n", avg4);
		
	}

}
