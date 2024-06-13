package ch_15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyInsert_01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc 		= new Scanner(System.in);
		System.out.println("MySQL Div. Code : ");
		String dno		= sc.nextLine();
		System.out.println("MySQL Div. Name : ");
		String dname	= sc.nextLine();
		System.out.println("MySQL Position  : ");
		String position	= sc.nextLine();
		
		Connection conn = null;
		Statement stmt	= null;
		
		String driver	= "com.mysql.cj.jdbc.Driver";
		String url		= "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql		= String.format("Insert Into division(dno, dname, position)"
							+ "values(%s, '%s', '%s')", dno, dname, position);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "MySQL84");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);

			if(result > 0) {
				System.out.println("MySQL Insertion is completed");
			} else {
				System.out.println("MySQL Insertion is failed");
			}
			conn.close();
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
