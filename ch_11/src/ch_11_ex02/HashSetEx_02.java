package ch_11_ex02;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		
		System.out.println("Num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Num2 : ");
		int num2 = sc.nextInt();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(num1);
		hs.add(num2);
		
		while(true) {
			int num = (int) (Math.random() * 45) + 1; 
			System.out.println("num -> " + num);			
			hs.add(num);
			cnt++;
			if(hs.size() == 6)
				break;
		}
		
		System.out.println(hs);
		System.out.println("Cnt = " + cnt);
		sc.close();

	}

}
