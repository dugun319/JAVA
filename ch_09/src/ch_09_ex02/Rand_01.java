package ch_09_ex02;

import java.util.Random;

public class Rand_01 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		System.out.println("100이하\t: " + ran.nextInt(101));
		System.out.println("랜덤정수\t: " + ran.nextInt());
		System.out.println("Double\t: " + ran.nextDouble());
		System.out.println("Float\t: " + ran.nextFloat());
		System.out.println("Long\t: " + ran.nextLong());
		
	}

}
