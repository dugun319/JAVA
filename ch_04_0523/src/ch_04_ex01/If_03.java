package ch_04_ex01;

public class If_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. If03 수행 시 파라미터를 하나 받음
		int score;
		char grade;
		
		score= Integer.parseInt(args[0]);
		
		//2. 
		//	1) 90 < score -> grade = A
		//	2) 80 < score <= 90 -> grade = B
		//	3) 70 < score <= 80 -> grade = c
		//	4) 60 < score <= 70 -> grade = D
		//	5) ELSE score <= 60 -> grade = F
		
		score= Integer.parseInt(args[0]);
		
		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 
			(score > 60) ? 'D' : 'F';
		
		System.out.println("Your Score is " + score + " and your grade is " + grade);
		
		
		
		score = Integer.parseInt(args[1]);
		
		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 
			(score > 60) ? 'D' : 'F';
		
		System.out.println("Your Score is " + score + " and your grade is " + grade);
		
		
		
		score = Integer.parseInt(args[2]);

		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 
			(score > 60) ? 'D' : 'F';

		System.out.println("Your Score is " + score + " and your grade is " + grade);
		
		

		score = Integer.parseInt(args[3]);

		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 
			(score > 60) ? 'D' : 'F';

		System.out.println("Your Score is " + score + " and your grade is " + grade);
		
		

		score = Integer.parseInt(args[4]);
		
		if(score > 90) {
			grade = 'A';
		} else if(score > 80) {
			grade = 'B';
		} else if(score > 70) {
			grade = 'C';
		} else if(score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Your Score is " + score + " and your grade is " + grade);
	}

}
