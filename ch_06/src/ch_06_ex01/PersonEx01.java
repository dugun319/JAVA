package ch_06_ex01;

class Person {
	
	String 	name;
	int 	age;
	String 	gender;
	
	void print() {
		System.out.printf("Name\t: %s\t|Age\t: %d\t|Gender\t: %s\n\n"
				, this.name, this.age, this.gender);
	}
	
	
}

public class PersonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.name = "Hong";
		p1.age = 52;
		p1.gender = "Male";
		
		Person p2 = new Person();
		p2.name = "Yeon";
		p2.age = 62;
		p2.gender = "Male";
		
		Person p3 = new Person();
		p3.name = "Shin";
		p3.age = 47;
		p3.gender = "Female";
		
		p1.print();
		p2.print();
		p3.print();

	}

}
