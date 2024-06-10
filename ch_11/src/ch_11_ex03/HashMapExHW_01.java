package ch_11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExHW_01 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("신용균", 80);
		map.put("홍길동", 95);
		map.put("신용권", 80);
		map.put("신용권", 85);
		
		System.out.println("Amount : " + map.size());
		System.out.println("Values : " + map);
		
		System.out.println("\nSystem.out.println(\"신용균 : \" + map.get(\"신용균\"));");
		System.out.println("신용균 : " + map.get("신용균"));

		System.out.println("\nKeySet");
		Set<String> keyMap = map.keySet();
		for(String tempStr : keyMap) {
			System.out.println(tempStr + " : " + map.get(tempStr));
		}
		
		System.out.println("\nIterator");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println(temp + " : " + map.get(temp));
		}
	}

}
