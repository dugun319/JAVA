package ch_02_0522;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean goStop = true;
		
		while(goStop) {
			if(goStop) {
				System.out.println("Let's Go!");
				goStop = false;
			} else {
				System.out.println("STOP!");
			}

		}
	}

}
