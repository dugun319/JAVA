package ch_07ex_02;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.setName("SuJi");
		st1.setAge(21);
		st1.setSno("01노 2560");
		
		Teacher tc1 = new Teacher();
		tc1.setName("GilDong");
		tc1.setAge(35);
		tc1.setSubject("Java");
		
		Manager mg1 = new Manager();
		mg1.setName("WonBin");
		mg1.setAge(23);
		mg1.setPart("CS");
		
		System.out.printf("Name\t: %-12s\t | Age\t: %d\t | S_ID\t: %s\n"
				, st1.getName(), st1.getAge(), st1.getSno());
		
		tc1.printAll();
		mg1.printAll();

	}

}
