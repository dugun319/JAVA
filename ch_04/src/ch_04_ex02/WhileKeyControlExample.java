package ch_04_ex02;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		boolean	run		= true;
		int 	speed	= 0;
		int 	keyCode	= 0;
		byte[]	temp 	= new byte[10]; 
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("____________________________________________");
				System.out.println("\n1. Acceleration | 2. Deceleration | 3. STOP ");
				System.out.println("____________________________________________");
				System.out.print("\nSelect : ");
			}
			
			System.in.read(temp);
			
			keyCode = temp[0];
			
			if(keyCode != 13 && keyCode != 10 && temp[1] == 13) {
				
				System.out.println("keyCode -> " + keyCode);
				
				if(keyCode == 49) {
					speed++;
					System.out.println("SPEED PLUS 1");
					System.out.println("Current Speed is " + speed);
				} else if(keyCode == 50) {
					speed--;
					System.out.println("SPEED MINUS 1");
					System.out.println("Current Speed is " + speed);
				} else if(keyCode == 51) {
					run = false;
					System.out.println("ESCAPE");
				} else {
					System.out.println("Wrong Input");
				}
			} else {
				System.out.println("Wrong Input");
			}
			
//			Select : 1
//			keyCode -> 49
//			result  1)speed +1
//					2)current speed
//			Select : 2
//			keyCode -> 50
//			result speed -1
//			
//			Select : 3
//			keyCode -> 51
//			run = false
//			ESCAPE
			
		}
		
		System.out.println("The program is ended");

	}

}
