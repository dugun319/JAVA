package ch_11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx_01 {

	public static void main(String[] args) {
		
		//1. Key duplication : X
		//2. Value duplication : O
		HashMap<String, String> hsMap01 = new HashMap<String, String>();
		hsMap01.put("Kim", "1111-2222");
		hsMap01.put("Lee", "2222-2222");
		hsMap01.put("Son", "1111-3333");
		hsMap01.put("Park", "1111-2222");
		
		System.out.println("Tell of Kim\t: " + hsMap01.get("Kim"));
		System.out.println("Tell of Lee\t: " + hsMap01.get("Lee"));
		System.out.println("Tell of Son\t: " + hsMap01.get("Son"));
		System.out.println("Tell of Park\t: " + hsMap01.get("Park"));
		System.out.println(hsMap01);

		
		System.out.println("\n\nhsMap01.put(\"Son\", \"1111-5555\");");
		hsMap01.put("Son", "1111-5555");
		
		System.out.println("Tell of Kim\t: " + hsMap01.get("Kim"));
		System.out.println("Tell of Lee\t: " + hsMap01.get("Lee"));
		System.out.println("Tell of Son\t: " + hsMap01.get("Son"));
		System.out.println("Tell of Park\t: " + hsMap01.get("Park"));
		
		System.out.println(hsMap01);
		
		Set<String> st = hsMap01.keySet();
		System.out.println("\nSet 을 이용한 출력");
		System.out.println(st);
		for(String tempStr : st) {
			System.out.println("Phone Number of " + tempStr + "\tis " + hsMap01.get(tempStr));
		}
		
		Iterator<String> it = hsMap01.keySet().iterator();
		System.out.println("\nKeySet의 Iterator를 이용한 출력");
		System.out.println(it);
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Phone Number of " + key + "\tis " + hsMap01.get(key));
		}

	}

}
