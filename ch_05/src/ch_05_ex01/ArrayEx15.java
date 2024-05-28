package ch_05_ex01;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		if(args.length !=3) {
			System.out.println("Usage : Java ArrayEx15 NUM1 OP NUM2");
			System.exit(0);
		}
		
		char op = args[1].charAt(0);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		System.out.println("op -> " + op);
		
		switch(op) {
		
			case '+' :
				//result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				result = num1 + num2;
				System.out.println("result -> " + result);
				break;
			case '-' :
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				System.out.println("result -> " + result);
				break;
			case 'X' :
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				System.out.println("result -> " + result);
				break;
			case '/' :
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
				System.out.println("result -> " + result);
				break;
			default:
				System.out.println("Wrong input, try again!");
		
		}
		
		/*
		if(op == '+') {
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			System.out.println("result -> " + result);
		} else if(op == '-') {
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			System.out.println("result -> " + result);
		} else if(op == 'X') {
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			System.out.println("result -> " + result);
		} else if(op == '/') {
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			System.out.println("result -> " + result);
		} else {
			System.out.println("Wrong input, try again!");
		}
		*/
	
		// +, -, X , / 수행
		// *는 .classpath를 가르키므로 X로 변경하여 사용하였음
		// switch 문으로 작성

	}

}
