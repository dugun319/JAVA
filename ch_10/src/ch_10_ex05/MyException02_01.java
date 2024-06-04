package ch_10_ex05;

//MIN salary error MSG
public class MyException02_01 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String errMsg;
		errMsg = "Are you crazy?";
		return errMsg;
	}
}
