package ch_07ex_03;

public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0 ; i < values.length ; i++) {
			sum += values[i];
		}
		System.out.printf("전달받은 인자는 %d 개입니다\n", values.length);
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		System.out.println("Values -> " + values);
		for(int i = 0 ; i < values.length ; i++) {
			sum += values[i];
		}
		System.out.printf("전달받은 인자는 %d 개입니다\n", values.length);
		return sum;
	}

}

