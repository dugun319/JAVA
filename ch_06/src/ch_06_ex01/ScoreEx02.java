package ch_06_ex01;

class Score2 {
	
	int kor;
	int eng;
	int math;
	
	Score2(int k, int e, int m) {
		this.kor = k;
		this.eng = e;
		this.math = m;
		
	}
	
	void print() {
		int sum =this.kor + this.eng + this.math;
		System.out.printf("Korean\t: %d\tEnglish\t: %d\tMath\t: %d\n",
				this.kor, this.eng, this.math);
		System.out.printf("Total\t: %d\tAverage\t: %4.2f\n\n", sum, (double) sum/3);
	}
	
	
}

public class ScoreEx02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score2 sc1 = new Score2(78, 88, 97);
		Score2 sc2 = new Score2(88, 98, 96);
		
		sc1.print();
		sc2.print();

	}

}
