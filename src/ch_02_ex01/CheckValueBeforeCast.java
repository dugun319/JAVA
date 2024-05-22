package ch_02_ex01;

public class CheckValueBeforeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i = 128;
		int i = 126;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("Byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
			
		} else {
			byte b = (byte) i;
			System.out.println("b -> " + b);
		}

	}

}
