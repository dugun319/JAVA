package ch_11_ex01;

import java.util.Stack;

//Last In First Out -> LIFO structure
// QUE -> First In First Out -> FIFO structure
public class StackEx_01 {

	public static void main(String[] args) {
		String [] pet = {"Gecko", "Dog", "Cat", "Beetle", "Farad", "Gecko"};
		Stack<String> st = new Stack<String>();
		for(String tempStr : pet) {
			System.out.println("Push -> " + tempStr);
			st.push(tempStr);
		}
		System.out.println("Push st -> " + st);

		
		System.out.println("-------------------------------");
		while(!st.isEmpty()) {
			System.out.println("Pop -> " + st.pop());
		}
		System.out.println("Pop st -> " + st);

	}

}
