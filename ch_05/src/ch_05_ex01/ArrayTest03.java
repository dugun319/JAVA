package ch_05_ex01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = array[0];
		
		for(int i = 0 ; i < array.length ; i++) {
			sum += array[i];
//			max = (max > array[i]) ? max : array[i];
//			min = (min < array[i]) ? min : array[i];
			if(max > array[i]) {
				max = array[i];
			}
			if(min < array[i]) {
				min = array[i];
			}
		}
		
		avg = sum / array.length;
		
		System.out.println("Summation -> " + sum);
		System.out.println("Average -> " + avg);
		System.out.println("Max -> " + max);
		System.out.println("Min -> " + min);
		

	}

}
