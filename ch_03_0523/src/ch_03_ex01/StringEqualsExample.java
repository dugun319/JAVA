package ch_03_ex01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "김혁";
		String strVar2 = "김혁";
		String strVar3 = new String("김혁");
				
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		//"=="는 주소값('c'의 pointer)를 비교한다.
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		//.equals()는 주소가 아닌 값을 비교
		

	}

}
