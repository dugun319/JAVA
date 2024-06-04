package ch_10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_03 {

	public static void main(String[] args) {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("Input number1 => ");
			int num1;
			try {
				num1 = Integer.parseInt(bin.readLine());
				System.out.println("Input number2 => ");
				int num2 = Integer.parseInt(bin.readLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
				
			} catch (NumberFormatException e) {
				System.out.println("You should input integer!");
			} catch (IOException e) {
				System.out.println("Wrong input, try again!");
			} catch (ArithmeticException e) {
				System.out.println("The divisor should not be Zero");
			} catch (Exception e) {
				System.out.println("Wrong Input, try again!");
			}
			
		}

	}

}

