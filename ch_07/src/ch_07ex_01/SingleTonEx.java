package ch_07ex_01;

class SingleTon {
	
	String str;
	
	//new 연산자를 통해서 생성하지 못하도록 private으로 선언	
	private static SingleTon instance;
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}

public class SingleTonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		
		
		st1.str = "Who are you?";
		System.out.println(st2.str);
		if(st1 == st2) {
			System.out.println
			("Same!");
		} else {
			System.out.println("Different!");
		}

	}

}
