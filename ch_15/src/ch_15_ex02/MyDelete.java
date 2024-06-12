package ch_15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDelete {

	public static void main(String[] args) throws SQLException {
		Scanner sc 		= new Scanner(System.in);
		System.out.println("MySQL Div. No. : ");
		String dno		= sc.nextLine();
		
		Connection conn = null;
		Statement stmt	= null;
		
		String driver	= "com.mysql.cj.jdbc.Driver";
		String url		= "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql		= "delete FROM division WHERE dno = " + dno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "MySQL84");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("MySQL DELETE is completed");
			} else {
				System.out.println("MySQL DELETE is failed");
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
