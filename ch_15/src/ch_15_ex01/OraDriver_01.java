package ch_15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDriver_01 {

	public static void main(String[] args) {
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// @127.0.0.1 mycom == localhost
		// @공유 DB
		System.out.println("Start1");
		try {
			
			// Oracle Driver Memory Up
			Class.forName(driver);
			System.out.println("Start2");
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Start3");
			if(conn != null) {
				System.out.println("Connection is Successed");
			} else {
				System.out.println("Connection is Failed");
			}
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
