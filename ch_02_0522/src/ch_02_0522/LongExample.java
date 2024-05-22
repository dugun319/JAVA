package ch_02_0522;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20l;
		long var3 = 30L;
		long var4 = 1000000000000000000L;
		long var5 = 1000000000000000000l;
		// L or l 지우면 컴파일 error
		// L 사용해라. 소문자는 잘 안 씀. error는 아님.
		// class 이름 대문자 시작과 유사
		
		System.out.println("var1 -> " + var1);
		System.out.println("var2 -> " + var2);
		System.out.println("var3 -> " + var3);
		System.out.println("var4 -> " + var4);
		System.out.println("var5 -> " + var5);

	}

}
