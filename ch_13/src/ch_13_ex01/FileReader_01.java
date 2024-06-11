package ch_13_ex01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader_01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input FileName :");
		String fileName = sc.nextLine();
		
		FileReader fr = new FileReader(fileName);
		
		int data = 0;
		
		// The character read, or -1 if the end of the stream has been reached
		while((data=fr.read()) != -1) {
			System.out.print((char)data);
		}
		fr.close();
		System.out.println();
		System.out.println("END");
		
		sc.close();

	}

}
