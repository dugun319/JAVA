package ch_09_ex03;

public class String_01 {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println("str1 -> + " + str1);
		System.out.println("str2 -> + " + str2);
		System.out.println("str3 -> + " + str3);
		System.out.println("str4 -> + " + str4);
		
		System.out.println("\nif(str1 == str2)");		
		if(str1 == str2) {
			System.out.println("Both str1 & str2 are same");
		} else {
			System.out.println("str1 & str2 are diferent each other");
		}
		
		System.out.println("\nif(str1 == str3)");
		if(str1 == str3) {
			System.out.println("Both str1 & str3 are same");
		} else {
			System.out.println("str1 & str3 are diferent each other");
		}
		
		System.out.println("\nif(str1.equals(str2))");
		if(str1.equals(str2)) {
			System.out.println("Both str1 & str2 are same");
		} else {
			System.out.println("str1 & str2 are diferent each other");
		}
		
		System.out.println("\nif(str1.equals(str3))");
		if(str1.equals(str3)) {
			System.out.println("Both str1 & str3 are same");
		} else {
			System.out.println("str1 & str3 are diferent each other");
		}
		
		System.out.println("\nif(str1.equals(str4))");
		if(str1.equals(str4)) {
			System.out.println("Both str1 & str4 are same");
		} else {
			System.out.println("str1 & str4 are diferent each other");
		}
		
		System.out.println("\nif(str1.equalsIgnoreCase(str4))");
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("Both str1 & str4 are same");
		} else {
			System.out.println("str1 & str4 are diferent each other");
		}
	}

}
