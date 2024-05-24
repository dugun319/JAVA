package ch_04_ex01;

public class Switch_05 {

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
				switch (num) {
					case 12 : System.out.println("초겨울");	break;
					case 1  : System.out.println("강추위");	break;
					case 2	: System.out.println("늦겨울");	break;	
				}
				season = "겨울";
				break;
			case 3  :
			case 4  :
			case 5  :
				if(num == 3 || num == 4) {
					System.out.println("Good Condition!");
				} else {
					System.out.println("So So ~~~");
				}
				season = "봄";
				break;
			case 6  :
			case 7  :
			case 8  :
				if(num == 6) {
					System.out.println("견딜만 해");
				} else {
					System.out.println("죽을 것 같아");
				}
				season = "여름";
				break;
			case 9  :
			case 10 :
			case 11 :
				if(num == 9 || num == 10) {
					System.out.println("항상 이때만 같아라");
				} else {
					System.out.println("좀 추운데");
				}
				season = "가을";
				break;
			default :
				season = "오류";
				break;
				
		}
		
		System.out.println(num + "월은 " + season + "입니다");

	}

}
