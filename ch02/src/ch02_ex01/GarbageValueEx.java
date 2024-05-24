package ch02_ex01;

public class GarbageValueEx {
	public static void main(String[] args) {
		byte var1 = 125;  // 1Byte
		int  var2 = 125;  // 4Byte

		//     1.초기값  3.비교      2.증분
		for(int i=0;    i<5;      i++) {
			var1++;  // var1 = var1 + 1;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
