package ch_11_ex01;

import java.util.ArrayList;

//LIST
public class ArrayList_02 {

	public static void main(String[] args) {
		// 중복 : O, 순서 : 유지
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("watermelon");
		list.add("apple");
		list.add("banana");
		list.add("watermelon");
		list.add("banana");
		list.add("banana");
		list.add("blueberry");
		list.add("jujube");
		System.out.println("Amount : " + list.size());
		System.out.println("List -> " + list);
		devPrint(list);
		
		list.add(1, "Kiwi");		//insert
		System.out.println("List -> " + list);
		
		list.set(4, "peach");		//replace
		System.out.println("List -> " + list);
		
		list.remove(0);
		System.out.println("List -> " + list);
		
		list.remove("banana");		//list의 첫 하나만 삭제
		System.out.println("List -> " + list);
		
		System.out.println("list.contains\t\t-> " + list.contains("banana"));
		System.out.println("list.indexOf\t\t-> " + list.indexOf("banana"));
		System.out.println("list.lastIndexOf\t-> " + list.lastIndexOf("banana"));
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).equals("banana")) {
				list.set(i, "strawberry");
			}
		}
		
		System.out.println("List -> " + list);
		
	}

	private static void devPrint(ArrayList<String> list) {
		for(String tempStr : list) {
			System.out.println(tempStr + "\t");
		}
		System.out.println("\n=================================");
	}

}
