package ch_02_0522;

public class VariableScopeExample {

	public static void main(String[] args) {
		int var1 = 15;
		
		//현제 상태는 무조건 수행
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			System.out.println("var1 -> " + var1);
			System.out.println("var2 -> " + var2);
		}
		System.out.println("var1 -> "+var1);
		//System.out.println("var1 -> "+var2);
	}

}
