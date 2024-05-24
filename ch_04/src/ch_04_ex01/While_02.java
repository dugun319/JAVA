package ch_04_ex01;

import java.io.IOException;

public class While_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("보고 싶은 구구단은?");
		int num = System.in.read() - '0';
		//System.in.read는 1byte만 읽을 수 있음.
		//scanner씁시다		
		
		//ASCII 코드 값으로 읽음
		//ex) 5입력 -> 53 -> '0'의 ASCII 값은 48 -> 53 - 48 = 5
		System.out.println("num -> " + num);
		
		int i = 1;
		
		if(num >=2 && num <20) {
			while(i <= 9) {
				System.out.println(num + " X " + i + " = " + (num * i));
				i++;
			}
		} else {
			System.out.println("구구단에 없는 숫자입니다.");
		}
		
		
		/*
		int num1 = 2;
		int num2 = 1;
		
		while(num1 <= 9) {
			while(num2 <= 9) {
				System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
				num2++;
			}
			System.out.println();
			num1++;
			num2 = 1;
		}
		*/
	}

}
