package ch_04_ex01;

public class If_05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    score = 0;
		String grade = "";
		
		for(int i=0 ; i<5 ; i++) {
			args[i] = ((int) (Math.random()*10000) % 50 + 51) + "";
			
			score = Integer.parseInt(args[i]);
			
			if(score >= 90) 				grade = "A";
			else if 	(score >= 80) 		grade = "B";
			else if 	(score >= 70)		grade = "C";
			else if 	(score >= 60) 		grade = "D";
			else							grade = "F";
			
			if(score >= 100)				grade += "+";
			else if		(score >= 60) {
				if		(score % 10 > 7)	grade += "+";
				else if (score % 10 < 4)	grade += "-";
				else						grade += "0";
			}
			
			System.out.println("Your Score is " + score + " and Your garade is " + grade);
		}

	}

}
