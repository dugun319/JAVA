package ch08_ex05;

public class Manager_02 extends Person_02 {
	
	private String part;

	public Manager_02(String name, int age, String part) {
		super(name, age);
		this.part = part;
	}
	
	public void print() {
		super.print();
		System.out.printf("Part\t: %s\n",  this.part);
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
}
