package ch_07ex_02;

public class Student {
	
	private String 	name;
	private int 	age;
	private String 	sno;
	
	public void printAll() {
		System.out.printf("Name\t: %-12s\t | Age\t: %d\t | S_ID\t: %s\n"
				, name, age, sno);
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

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	

}
