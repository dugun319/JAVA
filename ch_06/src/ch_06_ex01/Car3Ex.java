package ch_06_ex01;

public class Car3Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//memory 할당 + instance 초기화
		Car3 c1 = new Car3("SONATA", 10, 14);
		Car3 c2 = new Car3("DAMAS", 9, 20);
		
		//memory 할당
		Car3 c3 = new Car3();
		c3.name = "MOURNING";
		c3.inTime = 0;
		c3.outTime = 13;
		
		c1.print();
		c2.print();
		c3.print();

	}

}
