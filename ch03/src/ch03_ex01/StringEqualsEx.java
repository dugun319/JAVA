package ch03_ex01;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "김혁";
		String strVar2 = "김혁";
		String strVar3 = new String("김혁");

		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));

	}

}
