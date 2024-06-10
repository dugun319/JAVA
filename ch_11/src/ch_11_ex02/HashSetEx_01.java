package ch_11_ex02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx_01 {

	public static void main(String[] args) {
		
		//순서 : X & 중복 : X
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Gulung2");
		hs.add("Gulung1");
		hs.add("Gulung3");
		hs.add("Gulung4");
		hs.add("Gulung5");
		hs.add("Gulung2");
		hs.add("Gulung7");
		hs.add("Gulung8");

		
		for(String tempStr : hs) {
			System.out.println(tempStr);
		}
		
		System.out.println("==========Advanced==========");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
