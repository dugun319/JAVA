package ch_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Dept No.");
		String deptno = sc.nextLine();
		
		Connection 	conn = null;
		Statement	stmt = null;
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		String sql 		= String.format("DELETE dept "
				+ "WHERE deptno = %s", deptno);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("Delete is completed");
			} else {
				System.out.println("Delete is failed");
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
