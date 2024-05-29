package ch_06_ex09;

public class PackTest01 {
	
	public int a = 7;
	public int b = 20;
	
	public PackTest01() {
	}
	
	public PackTest01(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.printf("%d + %d = %d\n", this.a, this.b, this.a + this.b);
	}

}
