package ch_03_ex02;

public class CastinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "10";
		byte str1Value = Byte.parseByte(str1);
		System.out.println("str1Value -> " + str1Value);
		
		String str2 = "200";
		short str2Value = Short.parseShort(str2);
		System.out.println("str2Value -> " + str2Value);
		
		String str3 = "300000";
		int str3Value = Integer.parseInt(str3);
		System.out.println("str3Value -> " + str3Value);
		
		String str4 = "40000000000";
		long str4Value = Long.parseLong(str4);
		System.out.println("str4Value -> " + str4Value);
		
		String str5 = "3.141592";
		float str5Value = Float.parseFloat(str5);
		System.out.println("str5Value -> " + str5Value);
		
		String str6 = "3.141592";
		double str6Value = Double.parseDouble(str6);
		System.out.println("str6Value -> " + str6Value);

		String str7 = "true";
		boolean str7Value = Boolean.parseBoolean(str7);
		System.out.println("str7Value -> " + str7Value);
	}

}
