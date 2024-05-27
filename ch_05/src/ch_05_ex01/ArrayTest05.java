package ch_05_ex01;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] m = {"Name", "Korean", "English", "Math", "Total", "Average"};
		String [] name = {"XIAH", "High", "Ye-Eun", "Guckka"};
		
		int [][] score = {{80, 70, 90}, {70, 90, 90}, {80, 70, 80}, {90, 90, 70}};
		
		int [] t_score = new int[3];
		int sum = 0;
		int avg = 0;
		
		System.out.println("Report Card\n");
		for(int i = 0 ; i < m.length ; i++) {
			System.out.printf("%s\t", m[i]);
		}
		System.out.println("\n________________________________________________\n");
		
		

		for(int i = 0 ; i < name.length ; i++) {
			System.out.printf("%s\t", name[i]);
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("%d\t", score[i][j]);
				sum += score[i][j];
				t_score[j] += score[i][j];
			}
			
			System.out.printf("%d\t", sum);
			avg = sum/score[i].length;
			System.out.printf("%d\t", avg);
			System.out.println();
			
			sum = 0;
		}
		
		System.out.println("\n________________________________________________\n");
		System.out.printf("Total\t");
		
		for(int i = 0 ; i < t_score.length ; i++) {
			System.out.printf("%d\t", t_score[i]);
			sum += t_score[i];
		}
		System.out.printf("%d\t%4.2f\n", sum, (double) sum / (t_score.length * name.length));
		
	}

}
