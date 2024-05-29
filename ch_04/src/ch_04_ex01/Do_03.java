package ch_04_ex01;

import java.util.Scanner;

public class Do_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int num;
		int answer = (int) (Math.random() * 100) + 1;
		do {
			System.out.println("1~100 중 어떤 숫자일까요?");
			num = sc.nextInt();
			
			//System.out.println("num -> " + num);
			
			if(num == answer) {
				System.out.println("BINGO~~~ You made it in " + cnt + " times");
				sc.close();
				break;
			} else if(num > answer) {
				System.out.println("Input the smaller number");
			} else {
				System.out.println("Input the bigger number");
			}
			cnt++;
			//while loop이기 때문에 if문 밖에 있어도 무관
		} while(true);

	}

}
