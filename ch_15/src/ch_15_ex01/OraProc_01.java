package ch_15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc_01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Dept No.");
		String deptno = sc.nextLine();
		
		System.out.println("Input Dept Name");
		String dname = sc.nextLine();
		
		System.out.println("Input Location");
		String loc = sc.nextLine();
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		// Procedure call format
		String sql 		= "{call dept_INSERT(?, ?, ?)}";
		
		Connection 	conn = null;
		CallableStatement cs = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			
			cs.setString(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			
			int result = cs.executeUpdate();
			
			if(result > 0) {
				System.out.println("Procedure is completed");
			} else {
				System.out.println("Procedure is failed");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(cs != null) {
				cs.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		sc.close();
	}
}
