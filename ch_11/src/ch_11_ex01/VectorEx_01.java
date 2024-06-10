package ch_11_ex01;

import java.util.Vector;

public class VectorEx_01 {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("Gecko1");
		vc.add("Gecko3");
		vc.add("Gecko7");
		vc.add("Gecko5");
		vc.add("Gecko4");
		vc.add("Gecko1");
		vc.add("Gecko2");
		vc.add("Gecko1");
		
		for(int i = 0 ; i < vc.size() ; i++) {
			System.out.println(vc.get(i));
		}
		System.out.println("==========");
		for(String tempStr : vc) {
			System.out.println(tempStr);
		}

	}

}
