package ch_04_ex01;

public class Switch_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String season = "";
		
		args[0] = ((int) (Math.random()*10000) % 13 + 1) + "";
		num = Integer.parseInt(args[0]);
		
		switch(num) {
			case 12 :
			case 1  :
			case 2  :
				season = "겨울";
				break;
			case 3  :
			case 4  :
			case 5  :
				season = "봄";
				break;
			case 6  :
			case 7  :
			case 8  :
				season = "여름";
				break;
			case 9  :
			case 10 :
			case 11 :
				season = "가을";
				break;
			default :
				season = "오류";
				break;
				
		}
		
		System.out.println(num + "월은 " + season + "입니다");

	}

}