package ch_08ex_01;

interface E1 {
	void aa();
}

interface E2 extends E1 {
	void bb();
}

interface E3 extends E2 {
	void cc();
}

class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("E4, 나는 E2에 있는 method bb");
	}

	@Override
	public void aa() {
		System.out.println("E4, 나는 E1에 있는 method aa");		
	}

	@Override
	public void cc() {
		System.out.println("E4, 나는 E3에 있는 method cc");		
	}

}

//interface 간 연결을 확장(extends) -> implements 아님

public class Inter_02ex {

	public static void main(String[] args) {
		// 선언은 부모 type 가능 / 반대는 불가능
		E2 e2 = new E4();
		
		e2.aa();
		e2.bb();
		//extends 로 확장했기 때문에 E1, E2 까지 커버 / 권한설정에 유리할 듯
		
		E4 e4 = new E4();
		e4.aa();
		e4.bb();
		e4.cc();

	}

}
