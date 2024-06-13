package ch_15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class ORaProc_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input EMP No.");
		String empno = sc.nextLine();
		
		Connection 	conn	 = null;
		CallableStatement cs = null;
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		// Procedure call format
		String sql 		= "{? = call FUNC_SAL(?)}";
		
		try {
			Class.forName(driver);
			conn	= DriverManager.getConnection(url, "scott", "tiger");
			cs		= conn.prepareCall(sql);
			
			cs.setString(2, empno);
			cs.registerOutParameter(1, java.sql.Types.DOUBLE);
			cs.executeQuery();
			
			Double sal	= cs.getDouble(1);
			
			if(sal > 0) {
				System.out.println("The modification is completed");
				System.out.println("New EMP No. : " + empno);
				System.out.println("New EMP SAL : " + sal);
			} else {
				System.out.println("The modification is failed");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
