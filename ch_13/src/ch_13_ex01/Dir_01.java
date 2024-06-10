package ch_13_ex01;

import java.io.File;

public class Dir_01 {

	public static void main(String[] args) {
		// File file = new File(".");
		// File file = new File("src/ch_13_ex01");
		File file = new File("../ch_12");
		
		String [] list = file.list();
		System.out.println("list -> " + list);
		
		for(String tempStr : list) {
			System.out.println("list -> " + tempStr);
		}

	}

}
