package ch_02_ex01;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var1 = 3.14;
		double var2 = 3.141592;
		double var3 = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
		float var4 = 3.14F;
		float var5 = 3.141592F;
		float var6 = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
		// Long type과 마찬가지로 F를 써줘야 float으로 인식
		// ex float var7 = 3.14 -> compile error
		
		System.out.println("var1 -> " + var1);
		System.out.println("var2 -> " + var2);
		System.out.println("var3 -> " + var3);
		System.out.println("var4 -> " + var4);
		System.out.println("var5 -> " + var5);
		System.out.println("var6 -> " + var6);
		
		int var7 = 3000000;
		double var8 = 3e6;
		float var9 = 3e6F;
		double var10 = 2e-3;
		float var11 = 2e-3F;
		
		System.out.println("var7 -> " + var7);
		System.out.println("var8 -> " + var8);
		System.out.println("var9 -> " + var9);
		System.out.println("var10 -> " + var10);
		System.out.println("var11 -> " + var11);

	}

}
