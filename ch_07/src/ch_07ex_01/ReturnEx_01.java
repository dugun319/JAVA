package ch_07ex_01;

class C1 {
	
	void divide_01(int x, int y) { 
		if(y==0) {
			System.out.println("제수가 '0'이라 나눗셈 불가능");
			return; 	//method 호출 위치로 돌아가라는 의미
		}
		
		System.out.printf("%d\t/\t%d\t=\t%d\n", x, y, x/y);
	}
	
	int divide_02(int x, int y) {
		if(y==0) {
			System.out.println("제수가 '0'이라 나눗셈 불가능");
			return y; 	//method 호출 위치로 돌아가라는 의미
		} else {
			return x/y;
		}
	}
}

public class ReturnEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.divide_01(0, 3);
		
		int result = c.divide_02(5, 2);
		System.out.println(result);

	}

}
