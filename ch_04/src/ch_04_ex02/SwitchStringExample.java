package ch_04_ex02;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "";
		
//		부장 -> 700만원
//		과장 -> 500만원
//		그외 -> 300만원
		
		args[0] = "그외";
		args[1] = "과장";
		args[2] = "부장";
		
		int num = (int) ((Math.random())*100 % 3);		
		position = args[num];
		
		System.out.println(position + "은(는) " + ((num * 200)+300) + "만원입니다.");
	}

}
