package ch_11_ex01;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		// -> ArrayList<String> a1 = new ArrayList<>(); 같은 선언
		// 중복 : O, 순서 : 유지
		a1.add("Gulung2");
		a1.add("Gulung1");
		a1.add("Gulung3");
		a1.add("Gulung5");
		a1.add("Gulung9");
		a1.add("Gulung2");
		a1.add("Gulung6");
		
		for(int i = 0 ; i < a1.size() ; i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("========");
		
		for(String str : a1) {
			System.out.println(str);
		}

	}

}
