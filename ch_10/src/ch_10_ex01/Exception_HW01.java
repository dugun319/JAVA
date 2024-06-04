package ch_10_ex01;

import java.util.Scanner;

public class Exception_HW01 {

	public static void main(String[] args) {
		int result	= 0;
		int num1	= 0;
		int num2	= 0;
		Scanner sc	= new Scanner(System.in);
		
		do {
			try {

				System.out.println("Input number1 : ");
				num1 = Integer.parseInt(sc.nextLine());
				if(num1 == 0) {
					break;
				}
				System.out.println("Input number2 : ");
				num2 = Integer.parseInt(sc.nextLine());
				result = num1 / num2;
				System.out.printf("%d / %d = %d\n", num1, num2, result);
								
			}catch (NumberFormatException e) {
				System.out.println("You should input integer!");
			} catch (ArithmeticException e) {
				System.out.println("The divisor should not be Zero");
			} catch (Exception e) {
				System.out.printf("Something is wrong with input");
			} finally {
				System.out.printf("You can see me always\n");
			}
			
		} while(true); {
			
			System.out.println("The program is ended");
			sc.close();
		}
		

	}

}
