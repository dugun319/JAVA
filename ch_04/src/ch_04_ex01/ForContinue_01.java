package ch_04_ex01;

public class ForContinue_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("대박 i = " + i);
			if(i > 5) continue;
			//for문으로 다시 올라감
			System.out.println("쪽박 i = " + i);
		}

	}

}
