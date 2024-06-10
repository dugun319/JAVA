package ch_11_ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Tangerine");
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");
		list.add("Strawberry");
		list.add("Apple");
		
		System.out.println("Number of elements -> " + list.size());
		System.out.println("\n");
		
		System.out.println("<< Call the elements with iterator >>");
		Iterator<String> elements = list.iterator();
		
		System.out.println(list.iterator());
		System.out.println(elements.next());
		System.out.println(elements.next());
		System.out.println(elements.next());
		System.out.println(elements.next());
		System.out.println(elements.next());
		System.out.println("List : " + list);
		elements.remove();					//현재 위치의 list를 삭제
		System.out.println("List : " + list);
		System.out.println(elements.next());
		
			
		while(elements.hasNext()) {
			System.out.print(elements.next() + "\t");
		}		
		System.out.println("\n");

		System.out.println("<< Call the elements with get() >>");
		for(int i=0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("\n");
		
	}

}
