package ch_05_ex01;

public class MultiArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int [2][3];
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		System.out.println("-----Normal For Loop-----");
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				System.out.printf("a[%d][%d] = %d\t", i, j, a[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n-----Enhanced For Loop-----");
		int rowNum = 0;
		int columnNum = 0;
		
		for(int [] tempArray : a ) {
			for(int tempNum : tempArray) {
				System.out.printf("a[%d][%d] = %d\t", rowNum, columnNum, tempNum);
				columnNum++;
			}
			System.out.println();
			columnNum = 0;
			rowNum++;
		}
		
	}

}
