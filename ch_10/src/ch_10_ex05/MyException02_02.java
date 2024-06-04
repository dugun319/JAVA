package ch_10_ex05;

public class MyException02_02 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String errMsg;
		errMsg = "It is too much!";
		return errMsg;
	}

}
