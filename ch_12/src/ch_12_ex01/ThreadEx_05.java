package ch_12_ex01;

import javax.swing.JOptionPane;

public class ThreadEx_05 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		System.out.println("Your name is " + name);
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		

	}

}
