package ch_11_ex01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx_01 {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		String [] animal = {"Gecko", "Dog", "Cat", "Rabbit", "Farad"};
		for(int i = 0 ; i < animal.length ; i++) {
			lList.add(animal[i]);
		}
		System.out.println("lList -> " + lList);
		
		int i = 0;
		Iterator<String> it = lList.iterator();
		
		while(it.hasNext()) {
			System.out.println(i + " -> " + it.next());
			i++;
		}
		
		while(!lList.isEmpty()) {
			System.out.println(lList.poll());
		}
		//poll 은 호춢 후 삭제
		System.out.println(lList);

	}

}
