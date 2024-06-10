package ch_11_ex01;

import java.util.Vector;

public class VectorEx_02 {
	
	private static void vecPrint(Vector<String> vc) {
		for(String tempStr : vc) {
			System.out.print(tempStr + "\t");
		}
		System.out.println("\n===========================================================================");
		
	}


	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		
		vc.add("Watermelon");
		vc.add("Strawberry");
		vc.add("Banana");
		vc.add("Pepper");
		vc.add("Jujube");
		vc.add("Cucumber");
		System.out.println("Amount : " + vc.size());
		vecPrint(vc);
		
		vc.add(1, "Kiwi");
		vecPrint(vc);
		
		vc.set(4, "Peach");
		vecPrint(vc);
		
		vc.remove(0);
		vecPrint(vc);
		
		System.out.println("Index 2 -> " + vc.get(1));
		System.out.println("Is there Banana : " + vc.contains("Banana"));
		System.out.println("Index of Banana : " + vc.indexOf("Banana"));
		System.out.println("Last Index of Banana : " + vc.lastIndexOf("Banana"));
		
		for(int i = 0 ; i < vc.size() ; i++) {
			if(vc.get(i) == "Banana") {
				vc.set(i, "Apple");
			}
		}
		vecPrint(vc);
		
	}

}
