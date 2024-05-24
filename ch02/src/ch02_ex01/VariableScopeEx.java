package ch02_ex01;

public class VariableScopeEx {

	public static void main(String[] args) {
		int var1 = 15;
		// 현재상태는 무조건 수행 
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
	        System.out.println("var1->"+var1); 			
	        System.out.println("var2->"+var2); 			
		}
		
        System.out.println("var1->"+var1);
    // Block안에서만 유효
    //    System.out.println("var2->"+var2);
	}

}
