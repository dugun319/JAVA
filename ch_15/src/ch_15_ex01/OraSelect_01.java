package ch_15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect_01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Dept No.");
		int deptno = sc.nextInt();
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		String sql 		= "SELECT dname, loc FROM dept WHERE deptno = " + deptno;
		
		Connection conn = null;
		Statement stmt	= null;
		// select 로 조회한 결과는 ResultSet으로 저장
		ResultSet rs	= null;
		
		try {
			Class.forName(driver);
			conn 	= DriverManager.getConnection(url, "scott", "tiger");
			stmt 	= conn.createStatement();
			rs		= stmt.executeQuery(sql);
			
			if(rs.next()) {
				String dname	= rs.getString("dname");
				// String loc		= rs.getString("loc");
				// 가져오는 순서 번호를 삽입하여도 동일하게 호출
				String loc		= rs.getString(2);
				System.out.println("DeptNo\t\t: " + deptno);
				System.out.println("DeptName\t: " + dname);
				System.out.println("DeptLoc\t\t: " + loc);
			} else {
				System.out.println("There is no information");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		
		System.out.println(rs);
		
		sc.close();

	}

}
