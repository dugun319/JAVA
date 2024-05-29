package ch_04_ex01;

//x > 97 -> A+
//x < 94 -> A-
//else      A0

public class If_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    score = 0;
		String grade = "";
		
		for(int i=0 ; i<5 ; i++) {
			args[i] = ((int) (Math.random()*10000) % 50 + 51) + "";
			
			score = Integer.parseInt(args[i]);
			
			if(score >= 90) { 
				if		(score >= 97) 		grade = "A+";
				else if (score <= 94)		grade = "A-";
				else						grade = "A0";
			} else if 	(score >= 80) {
				if		(score >= 87) 		grade = "B+";
				else if (score <= 84)		grade = "B-";
				else						grade = "B0";
			} else if 	(score >= 70) {
				if		(score >= 77) 		grade = "C+";
				else if (score <= 74)		grade = "C-";
				else						grade = "C0";
			} else if 	(score >= 60) {
				if		(score >= 67) 		grade = "D+";
				else if (score <= 64)		grade = "D-";
				else						grade = "D0";
			} 	else 						grade = "F";
			
			System.out.println("Your Score is " + score + " and Your garade is " + grade);
		}

	}

}
