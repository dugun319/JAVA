package ch_02_ex01;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2;
		//compile error ->
		
		byte byteValue3 = (byte) (byteValue1 + byteValue2);
		
		int intValue1 = byteValue1 + byteValue2;
		
		System.out.println("intValue1 -> " + intValue1);
		System.out.println("byteValue3 -> " + byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		//char charValue3 = charValue1 + charValue2;
		//compile error ->
		char charValue3 = (char) (charValue1 + charValue2);
		
		int intValue2 = charValue1 + charValue2;
		
		System.out.println("유니코드 charValue3 -> " + charValue3);
		System.out.println("출력문자 charValue3 -> " + charValue3);
		System.out.println("유니코드 intValue2 -> " + intValue2);
		System.out.println("출력코드 intValue3 -> " + (char) intValue2);
		
		int intValue3 = 9;
		int intValue4 = intValue3 / 4;
		System.out.println("intValue3 -> " + intValue3);
		System.out.println("intValue4 -> " + intValue4);
		
		
		

	}

}
