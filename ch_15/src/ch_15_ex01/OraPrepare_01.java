package ch_15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare_01 {

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
		
		String sql 		= "INSERT INTO dept VALUES (?, ?, ?)";
		
		Connection 			conn	= null;
		PreparedStatement	pstmt 	= null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("Update is completed");
			} else {
				System.out.println("Update is failed");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		sc.close();
	}

}
