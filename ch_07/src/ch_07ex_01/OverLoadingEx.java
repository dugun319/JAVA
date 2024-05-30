package ch_07ex_01;

class OverLoad {
	
	void print() {
		
		System.out.println("The parameter is not existed");

	}

	void print(int inNum) {
		System.out.println("There is one parameter");
		System.out.printf("Integer : %d\n", inNum);

	}

	void print(String inStr) {
		System.out.println("There is one parameter");
		System.out.printf("String : %s\n", inStr);
	}

	void print(String inStr, int inNum) {
		System.out.println("There are two parameters");
		System.out.printf("String : %s\tInteger : %d\n", inStr, inNum);
	}

}

public class OverLoadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoad ol = new OverLoad();
		ol.print();
		System.out.println();
		ol.print(12);
		System.out.println();
		ol.print("대박");
		System.out.println();
		ol.print("금요일", 16);
		

	}

}
