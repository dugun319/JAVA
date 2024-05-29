package ch_06_ex01;

import ch_06_ex09.PackTest01;
//Package가 달라지면 import 명령어를 사용하여 선언

public class PackTestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackTest01 pt1 = new PackTest01();
		pt1.a = 5;
		pt1.b = 10;
		
		PackTest01 pt2 = new PackTest01(11, 15);
		
		pt1.print();
		pt2.print();

	}

}
