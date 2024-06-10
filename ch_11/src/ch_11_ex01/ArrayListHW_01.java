package ch_11_ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHW_01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/JSP");
		list.add("iBATIS");
		
		int size = list.size();		
		System.out.println("Amount\t: " + size);
		System.out.println("List\t: " + list);
		
		System.out.println("Index 2 : " + list.get(2));
		
		list.remove("Database");
		list.remove("Servlet/JSP");
		list.remove("iBATIS");
		
		System.out.println("\nRemove Database, Servlet/JSP, iBATIS");
		size = list.size();		
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Index " + i + " : " + list.get(i));
		}

	}

}
