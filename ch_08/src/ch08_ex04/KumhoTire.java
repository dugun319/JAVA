package ch08_ex04;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + 
					(maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.err.println("*** " + location + " KumhoTire is flattened");
			return false;
		}
	}

}
