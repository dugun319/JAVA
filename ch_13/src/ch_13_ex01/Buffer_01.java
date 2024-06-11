package ch_13_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("What is your address?");
		String addr = br.readLine();
		System.out.println(name + " lives in " + addr);

	}

}
