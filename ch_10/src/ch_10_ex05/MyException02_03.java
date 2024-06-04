package ch_10_ex05;

public class MyException02_03 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		
		String errMsg;
		errMsg = "Wrong operation\nHow to Use\nJAVA MyExceptionEx_02 num";
		return errMsg;
	}

}
