package ch_09_ex02;

public class Math_02 {

	public static void main(String[] args) {
		
		double d1 = 4.156;
		double d2 = 4.67;
		double d3 = -4.15;
		double d4 = -4.67;
		
		//round -> 반올림
		System.out.println("Round d1 = " + Math.round(d1));
		System.out.println("Round d2 = " + Math.round(d2));
		System.out.println("Round d3 = " + Math.round(d3));
		System.out.println("Round d4 = " + Math.round(d4));
		
		//floor -> 자기보다 작은 정수중 가장 큰 것
		System.out.println("Floor d1 = " + Math.floor(d1));
		System.out.println("Floor d2 = " + Math.floor(d2));
		System.out.println("Floor d3 = " + Math.floor(d3));
		System.out.println("Floor d4 = " + Math.floor(d4));
		
		//ceil -> 자기보다 큰 정수중 가장 작은 것
		System.out.println("Ceil d1 = " + Math.ceil(d1));
		System.out.println("Ceil d2 = " + Math.ceil(d2));
		System.out.println("Ceil d3 = " + Math.ceil(d3));
		System.out.println("Ceil d4 = " + Math.ceil(d4));
		
	}

}
