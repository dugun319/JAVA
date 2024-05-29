package ch_07ex_01;

class Encapsule {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age<0) {
			System.out.println("Wrong Input, input again!");
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	
	public String getNmae() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsule h1 = new Encapsule();
		//Encapsule h2 = new Encapsule();
		
		h1.setName("XIAH");
		h1.setAge(-33);
		
		System.out.printf("Name\t: %s\n", h1.getNmae());
		System.out.printf("Age\t: %s\n", h1.getAge());

	}

}
