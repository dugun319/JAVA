package ch_09_ex04;

public class Person {
	int		id;
	String	name;
	
	public Person(int id, String name) {
		this.id		= id;
		this.name	= name;
	}
	
	public boolean equals(Person tempP) {
		if(this.id == tempP.id) {
			return true;
		} else {
			return false;
		}
	}
}
