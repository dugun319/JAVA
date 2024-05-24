package ch_04_ex03;

import java.util.Scanner;

public class Ex_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run 	= true;
		int		balance = 0;
		int		tempMoney = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		//   1) balance = balance + 예금액
		// menuNum->2
		//   2) balance = balance - 출금액
		// menuNum->3
		//   잔고 조회 콘솔에 보여줌
		
		
		while(run) {
			System.out.println("_________________________________\n");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료 \n");
			System.out.println("_________________________________\n");
			System.out.print("선택 -> ");
			
			int menuNum = scanner.nextInt();
			
			switch (menuNum) {

				case 1 :
					System.out.print("입금액 : ");
					tempMoney = scanner.nextInt();
					balance = balance + tempMoney;
					break;
				case 2 :
					System.out.print("출금액 : ");
					tempMoney = scanner.nextInt();
					balance = balance - tempMoney;
					break;
				case 3 :
					System.out.println("잔고 : " + balance);
					break;
				case 4 :
					run = false;
					break;
				default :
					System.out.println("다시 입력하세요");
					break;
			}
		}
		
		scanner.close();
		System.out.println("종료합니다");
		
	}

}
