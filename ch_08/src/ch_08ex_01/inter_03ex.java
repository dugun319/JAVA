package ch_08ex_01;

interface F1 {
	void aa();
}

interface F2 {
	void bb();
}

//interface는 다중상속이 가능
interface F3 extends F1, F2 {
	void cc();
}

class F4 implements F3 {

	@Override
	public void bb() {
		System.out.println("F4, 나는 F2에 있는 method bb");
	}

	@Override
	public void aa() {
		System.out.println("F4, 나는 F1에 있는 method aa");		
	}

	@Override
	public void cc() {
		System.out.println("F4, 나는 F3에 있는 method cc");		
	}

}

class F5 implements F1, F2 {

	@Override
	public void bb() {
		System.out.println("F5, 나는 F2에 있는 method bb");
	}

	@Override
	public void aa() {
		System.out.println("F5, 나는 F1에 있는 method aa");		
	}
	
}

//interface 간 연결을 확장(extends) -> implements 아님
public class inter_03ex {

	public static void main(String[] args) {
		F4 f4 = new F4();
		f4.aa();
		f4.bb();
		f4.cc();

		
		F3 f3 = new F4();
		f3.aa();
		f3.bb();
		f3.cc();
		
		F2 f5 = new F5();
		//f5.aa(); F2는 bb 만 상속받을 수 있음
		f5.bb();
		//f5.cc(); F2는 bb 만 상속받을 수 있음
		

	}

}
