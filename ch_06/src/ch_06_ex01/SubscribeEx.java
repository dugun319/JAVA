package ch_06_ex01;

class Subscribe {
	
	public	String  name;
	private	String  telNum;
	private int		age;
	//동일 class 내에서만 접근가능
	//변경하기 위해서는 접근제어자(method) 필요
	
	Subscribe(String n, String t, int a) {
		this.name = n;
		this.telNum = t;
		this.age = a;
	}
	
	Subscribe(String n) {
		this.name = n;
	}

	void ChangeTelNum(String t) {
		this.telNum = t;
	}
	
	void ChangeAgeNum(int a) {
		if(a > 0) { 
			this.age = a;
		} else {
			System.out.println("말이 안 됩니다.");
		}
		
	}
	
	void print() {
		System.out.printf("Name : %s\tTel. : %s\tAge : %d\n"
				,this.name, this.telNum, this.age);
	}
	
}

public class SubscribeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subscribe s1 = new Subscribe("Lee", "010-1111-2222", 60);
		Subscribe s2 = new Subscribe("Kim");
		
		s1.print();
		s2.print();
		
		//s2.telNum = "010-3333-4444";
		//-> private 변수이기 동일 class 내에서만 접근가능하기 때문에 접근제어자가 필요함
		s2.ChangeTelNum("010-3333-4444");
		s2.ChangeAgeNum(-33);
		
		s1.print();
		s2.print();

	}

}
