package ch_04_ex02;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[6];

		boolean flag = true;
		
		
		while(flag) {
			for(int i = 0; i < 6 ; i++) {
				intArray[i] = (int) (Math.random()*10000) % 45 + 1;
			}
			if(intArray[0] == intArray[1] ||intArray[0] == intArray[2] ||
					intArray[0] == intArray[3] ||intArray[0] == intArray[4] ||
					intArray[0] == intArray[5] ||intArray[1] == intArray[2] ||
					intArray[1] == intArray[3] ||intArray[1] == intArray[4] ||
					intArray[1] == intArray[5] ||intArray[2] == intArray[3] ||
					intArray[2] == intArray[4] ||intArray[2] == intArray[5] ||
					intArray[3] == intArray[4] ||intArray[3] == intArray[5] ||
					intArray[4] == intArray[5]) {
				flag = true;
			} else {
				flag = false;
			}
			
		}

		for(int i = 0 ; i < 6 ; i++) {
		System.out.println("Your Lottery Number is " + intArray[i]);
		}
		
		
		int a = 10;
		int b = 15;
		int c = 7;
		
		int max;
		int min;
		max = (a > b) && (a > c) ? a : (b > c) ? b : c;
		min = (a < b) && (a < c) ? a : (b < c) ? b : c;
		
		System.out.println("\nThe max number is " + max);
		System.out.println("The min number is " + min);
				

	}

}
