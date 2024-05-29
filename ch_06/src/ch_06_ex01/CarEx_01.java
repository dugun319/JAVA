package ch_06_ex01;

class Car1 {
	//맴버변수 (member variable, 필드 field)
	String color;
	//static -> 공유변수, class 변수
	//동일한 class 내에서 공유되는 변수
	static int speed;
	int wheel;
	
	
	//행위 -> method (영문자 또는 &로 시작) 두 번째 부터 숫자가능
	void speedUp() {
		speed++;
		System.out.println(speed + " speed UP");
	}
	
	void print() {
		
		System.out.println("Color " + color);
		System.out.println("Speed " + speed);
	}

}


public class CarEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = true;
		int cnt = 0;
		
		//Car1.color = "Red";
		//-->compile error
		Car1.speed = 150;
		//--> class 공유 변수이기 때문에 사용가능
		
		//  instance(선언)		생성
		Car1 myCar 			= new Car1();
		
		//위의 한 줄로 작성한 코드와 동일한 결과
		Car1 yourCar;
		yourCar = new Car1();
		
		
		myCar.color = "Gray";
		Car1.speed = 33;
		//Car1.speed = 33;
		//-->compile 권고사항
		
		yourCar.color = "Black";
		Car1.speed = 22;
		
		myCar.speedUp();
		myCar.print();
		
		while(flag) {
			yourCar.speedUp();
			cnt++;
			if(Car1.speed == 100) {
				flag = false;
				System.out.println("Your car have speed up " + cnt + " times");
			}
			
		}
		
		yourCar.print();
		
		System.out.println(myCar.equals(yourCar));

	}

}
