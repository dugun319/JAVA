package ch08_ex04;

public class Tire {

	public int maxRotation;
	public int accumulatedRotation = 0;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location 		= location;
		this.maxRotation	= maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + 
		(maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.err.println("*** " + location + " tire is flattened");
			return false;
		}
	}
}
