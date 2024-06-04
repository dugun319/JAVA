package ch_10_ex04;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		//return super.getMessage();
		String errMsg;
		
		//business error message
		errMsg = "Bigger than 10";
		return errMsg;
	}

}


