package ch_07ex_01;

//Call by value
//Call by reference

class Data {
	int kor;
	int eng;
	int math;
	
	void addRef (Data d1, Data d2) {
		d1.kor = d2.eng;
		System.out.println("[d1] -> " + d1);
		System.out.println("[d2] -> " + d2);
		System.out.println("[d1.kor] -> " + d1.kor);
		System.out.println("[d2.eng] -> " + d2.eng);
		System.out.println(System.identityHashCode(d1.kor));
		System.out.println(System.identityHashCode(d2.eng));	
		System.out.println("Method 국어 점수 : " + d1.kor);
	}
	
	int addKor(int kor) {
		kor += 10;
		System.out.println("kor -> " + kor);
		return kor;
	}
}

public class DataEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor 	= 50;
		d1.math = 70;
		d2.eng 	= 80;
		
		System.out.println("Line42 " + System.identityHashCode(d3.kor));
		int d3_kor = d3.addKor(80);
		System.out.println("Line44 " + System.identityHashCode(d3.kor));
		System.out.println("d3_kor ->" + d3_kor);
		System.out.println("Line46 " + System.identityHashCode(d2.eng));
		d3.kor = d2.eng;
		System.out.println("Line48 " + System.identityHashCode(d2.eng));
		System.out.println("Line49 " + System.identityHashCode(d3.kor));
		
		System.out.println("Line51 " + System.identityHashCode(d1.kor));
		System.out.println("Line52 " + System.identityHashCode(d2.eng));

	
		//instance 를 넘겨주면, 주소값을 넘겨주는 것과 같은 효과
		
		d3.addRef(d1, d2);
	}

}
