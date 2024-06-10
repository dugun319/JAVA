package ch_13_ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter_01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input FileName");
		String fileName = sc.nextLine();
		System.out.println("Input Contents");
		String msg = sc.nextLine();
		
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		fw.write(date + " : " + msg);
		fw.close();
		
		System.out.println("END");
		sc.close();

	}

}
