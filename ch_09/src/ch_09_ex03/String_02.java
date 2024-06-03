package ch_09_ex03;

public class String_02 {

	public static void main(String[] args) {
		char [] c = {'K', 'o', 'r', 'e', 'a'};
		
		String str1 = new String(c);
		String str2 = new String(" Fighting");
		String str3 = str1 + str2;
		
		System.out.println(str3);
		
		System.out.println(2 + 0 + 2 + 4 + "년");
		System.out.println("Year1 : " + 2 + 0 + 2 + 4);
		System.out.println("Year2 : "+ (2 + 0 + 2 + 4));
	}

}
