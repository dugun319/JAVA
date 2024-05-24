package ch02_ex01;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue =  (char) intValue;
		System.out.println("charValue->"+charValue);

		long longValue1 = 5001234567L;
		intValue = (int) longValue1;
		System.out.println("intValue1->"+intValue);

		long longValue2 = 500L;
		intValue = (int) longValue2;
		System.out.println("intValue2->"+intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue2->"+intValue);

	}

}
