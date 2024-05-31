package ch08_ex05;

public class Student_02 extends Person_02 {
	
	private String sno;

	public Student_02(String name, int age, String sno) {
		super(name, age);
		this.sno = sno;
	}
	
	public void print() {
		super.print();
		System.out.printf("SNO\t: %s\n",  this.sno);
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	
	

}
