package ch_02_0522;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		//      1.초기값 2.비교 3.증분
		for(int i = 0 ; i<5 ; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}

	}

}
