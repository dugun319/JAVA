package ch_07ex_01;

import java.util.Scanner;

class Factorial {
	
	int result = 1;
	
	void factorial(int cnt) {
		if(cnt > 1) {
			result *= cnt;
			System.out.println(cnt + " * ");
			factorial(--cnt);
		} else {
			System.out.println(cnt);
			System.out.println("Result of Factorial : " + result);
			return;
		}
	}
}

public class FactorialEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial e = new Factorial();
		int inNum;
		System.out.println("Input the number below 10 : ");
		Scanner sc = new Scanner(System.in);
		inNum = sc.nextInt();
		e.factorial(inNum);
		sc.close();

	}

}
