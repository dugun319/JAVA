package ch_02_0522;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println("intValue -> " + intValue);
		System.out.println("charValue -> " + charValue);
		System.out.println();
		
		long longValue = 50000000000000L;
		intValue = (int) longValue;
		System.out.println("longValue -> " + longValue);
		System.out.println("intValue -> " + intValue);
		System.out.println();
		
		double doubleValue = 50000000000000000000.0;
		
		//double doubleValue = 3.141592;
		intValue = (int) doubleValue;
		System.out.println("doubleValue -> " + doubleValue);
		System.out.println("intValue -> " + intValue);
		System.out.println();

	}

}
