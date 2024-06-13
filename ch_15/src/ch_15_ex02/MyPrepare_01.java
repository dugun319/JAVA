package ch_15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPrepare_01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc 		= new Scanner(System.in);
		System.out.println("MySQL Div. Code : ");
		String dno		= sc.nextLine();
		System.out.println("MySQL Div. Name : ");
		String dname	= sc.nextLine();
		System.out.println("MySQL Phone     : ");
		String phone	= sc.nextLine();
		System.out.println("MySQL Position  : ");
		String position	= sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt	= null;
		
		String driver	= "com.mysql.cj.jdbc.Driver";
		String url		= "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql		= "INSERT INTO division VALUES(?, ?, ?, ?)";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "MySQL84");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, phone);
			pstmt.setString(4, position);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("MySQL Update is completed");
			} else {
				System.out.println("MySQL Update is failed");
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
