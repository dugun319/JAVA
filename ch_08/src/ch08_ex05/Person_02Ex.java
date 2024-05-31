package ch08_ex05;

public class Person_02Ex {

	public static void main(String[] args) {
		Person_02 [] ps = new Person_02[5];
		ps[0] = new Student_02("Ok, JuHyun", 23, "11112222");
		ps[1] = new Student_02("Kim, YooShin", 53, "22223333");
		ps[2] = new Teacher_02("Tea, ChoYoung", 48, "JAVA");
		ps[3] = new Manager_02("Kim, SoHyun", 28, "Cleaning");
		ps[4] = new Manager_02("Jeon, HyunMoo", 40, "Information");
		
		for(Person_02 tempP : ps) {
			tempP.print();
			if(tempP instanceof Manager_02) {
				System.out.println("2nd way\t: " + ((Manager_02) tempP).getPart());
			}
		}
		
	}

}
