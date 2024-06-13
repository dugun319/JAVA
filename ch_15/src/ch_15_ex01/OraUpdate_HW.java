package ch_15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate_HW {

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
		
		String sql 		= String.format("UPDATE dept "
				+ "SET dname = '%s', loc = '%s' "
				+ "WHERE deptno = %s", dname, loc, deptno);
		
		Connection 	conn = null;
		Statement	stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("Update is completed");
			} else {
				System.out.println("Update is failed");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		sc.close();

	}

}
