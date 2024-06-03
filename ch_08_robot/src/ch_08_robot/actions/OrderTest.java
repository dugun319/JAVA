package ch_08_robot.actions;

public class OrderTest {
	static class Parents {
		public int 		pNum = 15;
		public int		tNum = 0;
		public String	pStr = "parents";
		public String	tStr = "test from Parents";
		
		public void pMethod() {
			System.out.println("pMethod");
		}
		
		public void tMethod() {
			System.out.println("T_pMethod");
		}
	}
	
	static class Child extends Parents {
		public int		cNum = 25;
		public int		tNum = 1;
		public String	cStr = "child";
		public String	tStr = "test from child";
		
		public void cMethod() {
			System.out.println("pMethod");
		}
		
		public void tMethod() {
			System.out.println("T_cMethod");
		}
		
	}
	
	public static void main(String[] args) {
		Parents tParents = new Parents();
		Child tChild = new Child();
		Parents test = new Child();
		
		System.out.println(tParents.pNum);
		System.out.println(tParents.tNum);
		System.out.println(tParents.pStr);
		System.out.println(tParents.tStr);
		
		System.out.println(tChild.pNum);
		System.out.println(tChild.cNum);
		System.out.println(tChild.tNum);
		System.out.println(tChild.pStr);
		System.out.println(tChild.cStr);
		System.out.println(tChild.tStr);
		
		System.out.println(test.pNum);
		//System.out.println(test.cNum);
		System.out.println(test.tNum);
		test.pMethod();
		test.tMethod();
		System.out.println(test.pStr);
		//System.out.println(test.cStr);
		System.out.println(test.tStr);
		
		
		
	}

}
