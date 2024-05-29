package ch_06_ex01;

//일종의 설계도, 객체생성을 위한 구조

public class Car {
	//맴버변수 (member variable, 필드 field)
	String color;
	int speed;
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
