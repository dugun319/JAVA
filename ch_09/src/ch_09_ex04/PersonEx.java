package ch_09_ex04;

public class PersonEx {

	public static void main(String[] args) {

		Person p1 = new Person(1111, "광해");
		Person p2 = new Person(1111, "광해군");
		
		if(p1.equals(p2)) {
			System.out.println("They are both the same");
		} else {
			System.out.println("They are different each other");
		}
	}

}
