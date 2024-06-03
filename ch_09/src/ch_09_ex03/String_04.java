package ch_09_ex03;

public class String_04 {

	public static void main(String[] args) {

		String str1	= 321 + "";
		String str2	= String.valueOf(321);
		
		char c1		= str1.charAt(0);
		char c2		= str1.charAt(1);
		char c3		= str1.charAt(2);
		
		System.out.println("str1\t-> " + str1);
		System.out.println("str1\t-> " + str2);
		System.out.println("c\t-> " + c1);
		System.out.println("c\t-> " + c2);
		System.out.println("c\t-> " + c3);
	}

}
