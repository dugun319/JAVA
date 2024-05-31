package ch08_ex05;

public class Teacher_02 extends Person_02 {
	
	private String subject;

	public Teacher_02(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.printf("Subject\t: %s\n",  this.subject);
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}
