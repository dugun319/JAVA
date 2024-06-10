package ch_11_ex03;

import java.util.Hashtable;

public class HashTableEx_01 {

	public static void main(String[] args) {
		Hashtable<String, String> hT = new Hashtable<String, String>();
		
		hT.put("Cho", "010-1111-2222");
		hT.put("Son", "010-1112-2223");
		hT.put("Lee", "010-1113-2224");
		
		System.out.println("Tell of Cho\t: " + hT.get("Cho"));
		System.out.println("Tell of Son\t: " + hT.get("Son"));
		System.out.println("Tell of Lee\t: " + hT.get("Lee"));

	}

}
