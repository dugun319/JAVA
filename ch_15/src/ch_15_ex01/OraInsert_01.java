package ch_15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert_01 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Dept No.");
		String deptno = sc.nextLine();
		
		System.out.println("Input Dept Name");
		String dname = sc.nextLine();
		
		System.out.println("Input Location");
		String loc = sc.nextLine();
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		// String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// String url 		= "jdbc:oracle:thin:@172.30.1.39:1521:xe";
		// 다른 사람 DB에 접근이 가능
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		// INSERT INTO dept VALUES(60, 'Sales_02', 'Chungang');
		// "sql" is not case sensitive 
		String sql 		= String.format("INSERT INTO dept VALUES(%s, '%s', '%s')",
							deptno, dname, loc);
		
		Connection 	conn = null;
		Statement	stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			// CRUD 중에서 CUD는 executeUpdate
			// R (select) 는 stmt.executeQuery(sql);
			
			int result = stmt.executeUpdate(sql);
			// -> insert EA 를 반환
			if(result > 0) {
				System.out.println("Insert is completed");
			} else {
				System.out.println("Insert is failed");
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
