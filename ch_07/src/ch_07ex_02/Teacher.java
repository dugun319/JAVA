package ch_07ex_02;

public class Teacher {
	private String 	name;
	private int 	age;
	private String 	subject;
	
	public void printAll() {
		System.out.printf("Name\t: %-12s\t | Age\t: %d\t | Sub.\t: %s\n"
				, name, age, subject);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
