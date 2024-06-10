package ch_11_ex02;

import java.util.TreeSet;

// 순서 : O & 중복 : X

public class TreeSetEx_01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while(ts.size() != 6) {
			int num = (int)(Math.random() * 45) + 1;
			System.out.println("Num -> " + num);
			ts.add(num);
		}
		
		System.out.println(ts);

	}

}
