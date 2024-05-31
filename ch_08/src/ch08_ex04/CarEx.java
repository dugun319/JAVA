package ch08_ex04;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		for(int i = 1 ; i <=5 ; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			
				case 1 :
					System.out.println("FrontLeft is replaced by Hankook Tire");
					car.frontLeftTire 	= new HankookTire("FL", 15);
					break;
				case 2 :
					System.out.println("FrontRight is replaced by Kumho Tire");
					car.frontRightTire 	= new KumhoTire("FR", 13);
					break;
				case 3 :
					System.out.println("RearLeft is replaced by Hankook Tire");
					car.rearLeftTire 	= new HankookTire("FL", 14);
					break;
				case 4 :
					System.out.println("RearRight is replaced by Kumho Tire");
					car.rearRightTire 	= new KumhoTire("FL", 17);
					break;
			
			}
		}

	}

}
