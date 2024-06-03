package ch_09_ex02;

public class Math_01 {

	public static void main(String[] args) {
		int [] i = new int[6];
		
		for(int j = 0 ; j < i.length ; j++) {
			int temp = (int) (Math.random() * 45) + 1;
			i[j] = temp;
			
		}
		
		for(int j = 0 ; j < i.length ; j++) {
			System.out.println(" : " + i[j]);
		}
	}

}
