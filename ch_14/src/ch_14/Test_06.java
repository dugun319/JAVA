package ch_14;

// implements vs extends
// 항목		implements		extends
// 상속		interface		class
// 사용		표준화 / 부품화		class 재사용
// 상속수		multi-			single
// 공통점		inheritance
// cf. interface extends interface (인터페이스 간 확장은 가능)

interface A5 {
	
}

class A6 implements A5 {
	A6() {
		System.out.println("Create A6");
	}
		
}

public class Test_06 {

	public static void main(String[] args) {
		A6 a6 = new A6();
		
		System.out.println(a6);

	}

}
