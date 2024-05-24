package ch_04_ex01;

import java.io.IOException;

public class For_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("보고 싶은 구구단 숫자는?");
		
		int num = System.in.read() - '0';
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
