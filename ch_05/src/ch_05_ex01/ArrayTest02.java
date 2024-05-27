package ch_05_ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 2680;
		//index         0    1    2   3
		int [] unit = {500, 100, 50, 10};
		for(int i = 0 ; i <unit.length ; i++) {
			int cnt = money / unit[i];
			System.out.printf("%d짜리\t동전 %d개\n", unit[i], cnt);
			money %= unit[i];
			System.out.printf("Remain -> %d\n", money);
		}

	}

}
