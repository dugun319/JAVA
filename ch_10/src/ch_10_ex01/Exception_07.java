package ch_10_ex01;

public class Exception_07 {
	
	static void callDriver() throws ClassNotFoundException {
		System.out.println("The 'callDriver()' is running");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("The call of the 'callDriver()' is completed.");
	}

	public static void main(String[] args) {
		System.out.println("Before call the 'callDriver()'");
		try {
			callDriver();
		} catch (ClassNotFoundException e) {
			System.out.println("The 'callDriver()' is not founded");
		} catch (Exception e) {					// exception 의 default
			System.out.println(e.getMessage());
		} finally {
			System.out.println("System is closed");
		}

	}

}
