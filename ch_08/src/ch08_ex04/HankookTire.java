package ch08_ex04;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + 
					(maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.err.println("*** " + location + " HankookTire is flattened");
			return false;
		}
	}
}
