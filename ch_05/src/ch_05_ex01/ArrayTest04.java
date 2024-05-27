package ch_05_ex01;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {76, 45, 34, 89, 100, 50, 90, 92};
		int temp = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = i+1 ; j < array.length ; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(" " + array[i]);
		}

	}

}
