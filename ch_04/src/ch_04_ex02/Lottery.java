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
		
		
		int a = intArray[0];
		int b = intArray[1];
		int c = intArray[2];
		int d = intArray[3];
		int e = intArray[4];
		int f = intArray[5];
		
		
		int max;
		int min;
		max = 	(a > b) && (a > c) && (a > d) && (a > e) && (a > f) ? a : 
				(b > c) && (b > d) && (b > e) && (b > f)? b :
				(c > d) && (c > e) && (c > f) ?	c :
				(d > e) && (d > f) ? d :
				(e > f) ? e : f;
		min = 	(a < b) && (a < c) && (a < d) && (a < e) && (a < f) ? a : 
				(b < c) && (b < d) && (b < e) && (b < f)? b :
				(c < d) && (c < e) && (c < f) ?	c :
				(d < e) && (d < f) ? d :
				(e < f) ? e : f;
		
		System.out.println("\nThe max number is " + max);
		System.out.println("The min number is " + min);
				

	}

}
