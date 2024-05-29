package ch_03_ex02;

public class ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int student = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / student;
		
		//남은 연필 수
		int pencilsLeft = pencils % student;
		
		System.out.println("pencilsPerStudent is " + pencilsPerStudent);
		System.out.println("pencilsLeft is " + pencilsLeft);

	}

}
