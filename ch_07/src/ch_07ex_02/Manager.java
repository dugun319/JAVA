package ch_07ex_02;

public class Manager {
	private String	name;
	private int		age;
	private String	part;
	
	public void printAll() {
		System.out.printf("Name\t: %-12s\t | Age\t: %d\t | Part\t: %s\n"
				, name, age, part);
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

	public String getPart() {
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	

}
