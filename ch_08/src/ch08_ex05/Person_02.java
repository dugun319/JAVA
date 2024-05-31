package ch08_ex05;

public class Person_02 {
	
	private String 	name;
	private int		age;

	public Person_02(String name, int age) {
		this.name 	= name;
		this.age 	= age;
	}
	
	public void print() {
		System.out.println("\n========================");
		System.out.printf("Name\t: %s\n", this.name);
		System.out.printf("Age\t: %s\n",  this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
