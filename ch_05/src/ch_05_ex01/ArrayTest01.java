package ch_05_ex01;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}};
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				System.out.printf("a[%d][%d] = %d\t ", i, j, a[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int num : a[i]) {
			System.out.printf("%d\t", num);
			}
			System.out.println();
		}

	}

}
