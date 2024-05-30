package ch_07ex_01;

class G2 {
	
	int k;
	
	G2() {
		System.out.println("The parameter is not existed");
	}

	G2(int k) {
		
		this();		//기본 생성자를 호출
		this.k = k;
		System.out.printf("Number of parameter : 1 | k = %d\n", k);
	}

	G2(int k, int y) {
		this();		//기본 생성자를 호출
		this.k = k;
		System.out.printf("Number of parameter : 2 | k = %d\ty = %d\n", k, y);
	}

	void print() {
		System.out.println("k = " + k);
	}
}

public class ThisEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G2 g1 = new G2(7);
		g1.print();
		
		G2 g2 = new G2(7, 15);
		g2.print();

	}

}
