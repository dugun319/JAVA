package ch_06_ex01;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = true;
		int cnt = 0;
		
		//  instance(선언)		생성
		Car myCar 			= new Car();
		
		//위의 한 줄로 작성한 코드와 동일한 결과
		Car yourCar;
		yourCar = new Car();
		
		
		myCar.color = "Gray";
		myCar.speed = 33;
		
		yourCar.color = "Black";
		yourCar.speed = 22;
		
		myCar.speedUp();
		myCar.print();
		
		while(flag) {
			yourCar.speedUp();
			cnt++;
			if(yourCar.speed == 100) {
				flag = false;
				System.out.println("Your car have speed up " + cnt + " times");
			}
			
		}
		
		yourCar.print();
		
		System.out.println(myCar.equals(yourCar));

	}

}
