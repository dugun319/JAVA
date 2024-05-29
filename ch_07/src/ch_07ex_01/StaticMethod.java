package ch_07ex_01;

class StaticMd {
	
	int num = 0;
	
	void display() {
		num++;
		System.out.println("Num -> " + num);
	}
	
	static void print(String str) {
		//num++;
		System.out.println("Wednesday" + str);
		//System.out.println("Num -> " + num);
		//complie error -> static method에서는 static value만 사용가능
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMd.print("생성 전");
		
		StaticMd stMe = new StaticMd();
		
		stMe.display();
		stMe.display();
		stMe.display();
		//stMe.print("생성 후");
		//Static 사용 방법을 권고
		StaticMd.print("생성 후");
		
		

	}

}
