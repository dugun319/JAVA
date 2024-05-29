package ch_07ex_01;

class F1 {
	int add(int x, int y) {
		return x + y;
	}
	String print(String name) {
		return name + "\tReturn name";
	}
}

public class ReturnEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F1 f1 = new F1();
		
		System.out.println(f1.add(10, 5));
		
		int k = f1.add(9,  6);
		
		System.out.println("Result : " + k);
		System.out.println(f1.print("YangManChun"));
		String resName = f1.print("DaeChoYoung");
		System.out.println("ResName : " + resName);

	}

}
